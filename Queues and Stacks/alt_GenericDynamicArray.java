/**
 * Object adjusts the size of underlying array to accommodate any number of new
 * elements added to it. The class is written as generic.
 */
public class alt_GenericDynamicArray<E extends Comparable<E>> implements Comparable<alt_GenericDynamicArray<E>> {

    private static final int DEFAULT_SIZE = 4;

    /** The underlying array of the data structure */
    private E[] underlying;
    /** How many elements have been added to the underlying array */
    private int occupancy;

    @SuppressWarnings("unchecked")
    /** Basic constructor */
    public alt_GenericDynamicArray(int size) {
        // Guard statement here to ensure that the user-provided size is legit.
        if (size < 1) {
            size = DEFAULT_SIZE;
        }
        // Create an Object array of the requested size, then cast it
        // as an array of objects E
        this.underlying = (E[]) (new Object[size]);
        // At the beginning the underlying array is empty
        this.occupancy = 0;
    } // basic constructor

    /** Default constructor */
    public alt_GenericDynamicArray() {
        this(DEFAULT_SIZE);
    } // default constructor

    /** Plain accessor for occupancy */
    public int getOccupancy() {
        return this.occupancy;
    } // method getOccupancy


    /** Accessor for the first element of the underlying array */
    public E getFirst() {
        return this.underlying[0];
    } // method getFirst

    /**
     * Helper method that ensures the underlying array has always room for
     * additional elements.
     */
    private void ensureSpace() {
        if (this.occupancy == this.underlying.length) {
            this.resize();
        }
    } // method ensureSpace

    /**
     * Resize the underlying array as needed.
     */
    @SuppressWarnings("unchecked")
    private void resize() {
        // Create temporary array double the size of the underlying array
        E[] temp = (E[]) new Object[2 * this.underlying.length];
        for (int i = 0; i < this.underlying.length; i++) {
            temp[i] = this.underlying[i];
        }
        this.underlying = temp;
    } // method resize

    /**
     * Helper method to place an element at a specified position and increement the
     * occupancy of the underlying data structure. The method performs no safety
     * checkd and simply overwrites the assigned position. It is assumed that any
     * necessary checks to make sure the position can be overwritten has bene done
     * by the calling method.
     */
    private void placeItem(E e, int position) {
        this.underlying[position] = e;
        this.occupancy++;
    } // method placeItem

    /**
     * Method to shift everying after a specified position in the underlying array,
     * one place to the right. The method performs no check to ensure that array
     * indices are within bounds. It assumes that the calling method has made the
     * necessary checks. This is important because the loop in this method starts
     * from position [this.occupancy] in the underlying array. When the underlying
     * array is full, the reference [this.occupancy] is an out-of-bounds index. The
     * array, in such cases, must be resized first. This is the responsibility of
     * the calling function.
     * 
     * @param index
     */
    private void shiftRight(int index) {
        for (int i = this.occupancy; i >= index; i--) {
            this.underlying[i] = this.underlying[i - 1];
        }
    } // method shiftRight

    /** Ands an element to the next available position in the underlying array. */
    public void add(E e) {
        this.ensureSpace();
        this.placeItem(e, this.occupancy);
    } // method add

    /**
     * Adds a new item at a specified position in the array. Position must be among
     * already occupied elements in the underlying array to maintain contiguity
     * 
     * @param e     E object to add to underlying array
     * @param index position to add object to.
     */
    public void add(E e, int index) {
        // Guard statement
        if (index >= 0 && index < this.occupancy) {
            this.ensureSpace();
            this.shiftRight(index);
            this.placeItem(e, index);
        }
    } // method add

    /**
     * Comparable implementation based on the occupancy value for each underlying
     * array.
     */
    public int compareTo(alt_GenericDynamicArray<E> other) {
        return this.occupancy - other.getOccupancy();
    } // method compareTo

} // class GenericDynamicArray
