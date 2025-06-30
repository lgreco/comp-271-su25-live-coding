/**
 * Object adjusts the size of underlying array to accommodate any number of new
 * elements added to it. The class is written as generic.
 */
public class GenericDynamicArray<E extends Comparable<E>> implements Comparable<GenericDynamicArray<E>> {

    private static final int DEFAULT_SIZE = 4;

    /** The underlying array of the data structure */
    private E[] underlying;
    /** How many elements have been added to the underlying array */
    private int occupancy;

    @SuppressWarnings("unchecked")
    /** Basic constructor */
    public GenericDynamicArray(int size) {
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
    public GenericDynamicArray() {
        this(DEFAULT_SIZE);
    } // default constructor

    /** Plain accessor for occupancy */
    public int getOccupancy() {
        return this.occupancy;
    } // method getOccupancy

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

    private void placeItem(E e, int position) {
        this.underlying[position] = e;
        this.occupancy++;
    }

    private void shiftRight(int index) {
        for (int i = this.occupancy; i >= index; i--) {
            this.underlying[i] = this.underlying[i - 1];
        }
    }

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
    public int compareTo(GenericDynamicArray<E> other) {
        return this.occupancy - other.getOccupancy();
    } // method compareTo

} // class GenericDynamicArray
