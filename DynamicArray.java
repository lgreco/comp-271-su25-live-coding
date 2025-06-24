/**
 * Object adjusts the size of underlying array to accommodate any number of new
 * elements added to it. The class is written as generic.
 */
public class DynamicArray<E> {

    private static final int DEFAULT_SIZE = 4;

    /** The underlying array of the data structure */
    private E[] underlying;
    /** How many elements have been added to the underlying array */
    private int occupancy;

    @SuppressWarnings("unchecked")
    /** Basic constructor */ 
    public DynamicArray (int size) {
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
    public DynamicArray() {
        this(DEFAULT_SIZE);
    } // default constructor

    /**
     * Resize the underlying array as needed.
     */
    @SuppressWarnings("unchecked")
    private void resize() {
        // Create temporary array of desired size
        E[] temp =  (E[]) new Object[2*this.underlying.length];
        for (int i = 0; i < this.underlying.length; i++) {
            temp[i] = this.underlying[i];
        }
        this.underlying = temp;
    } // method resize

}
