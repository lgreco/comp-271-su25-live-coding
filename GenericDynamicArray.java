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

    /** Ands an element to the next available position in the underlying array. */
    public void add(E e) {

        if (this.occupancy == this.underlying.length) {
            this.resize();
        }
        this.underlying[this.occupancy] = e;
        this.occupancy++;
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
            // Make sure there is room for one more element or resize
            if (this.occupancy == this.underlying.length) {
                this.resize();
            }
            // Shift items to the right
            for (int i = this.occupancy; i >= index; i--) {
                this.underlying[i] = this.underlying[i - 1];
            }
            // Place at specified position
            this.underlying[index] = e;
            this.occupancy++;
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