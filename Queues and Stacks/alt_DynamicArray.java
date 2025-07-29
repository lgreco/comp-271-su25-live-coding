/**
 * Object adjusts the size of underlying array to accommodate any number of new
 * elements added to it. The class is written as generic.
 */
public class alt_DynamicArray<E extends Comparable<E>> {

    private static final int DEFAULT_SIZE = 4;

    /** The underlying array of the data structure */
    private E[] underlying;
    /** How many elements have been added to the underlying array */
    private int occupancy;

    @SuppressWarnings("unchecked")
    /** Basic constructor */
    public alt_DynamicArray(int size) {
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
    public alt_DynamicArray() {
        this(DEFAULT_SIZE);
    } // default constructor

    /** Accessor for the first element of the underlying array */
    public E getFirst() {
        return this.underlying[0];
    } // method getFirst

    /**
     * Resize the underlying array as needed.
     */
    @SuppressWarnings("unchecked")
    private void resize() {
        // Create temporary array of desired size
        E[] temp = (E[]) new Object[2 * this.underlying.length];
        for (int i = 0; i < this.underlying.length; i++) {
            temp[i] = this.underlying[i];
        }
        this.underlying = temp;
    } // method resize

    public void add(E e) {
        if (this.occupancy == this.underlying.length)
            this.resize();
        this.underlying[this.occupancy++] = e;
    }

    public int indexOf(E e) {
        int i = 0;
        boolean found = false;
        while (!found && i < this.underlying.length) {
            found = e.compareTo(this.underlying[i++]) == 0;
        }
        return (found) ? i - 1 : -1;
    }

    private static final String EMPTY_ARRAY = "This dynamic array is empty.";
    private static final String FMT_OCCUPANCY = "There are %d elements(s) in the dynamic array:\n[ %s";
    private static final String FMT_ELEMENT = ", %s";
    private static final String FMT_CLOSING = "]";

    public String toString() {
        String result = null;
        if (this.occupancy == 0) {
            result = EMPTY_ARRAY;
        } else {
            result += String.format(FMT_OCCUPANCY, this.occupancy, this.underlying[0]);
            for (int i = 1; i < this.underlying.length; i++) {
                result += String.format(FMT_ELEMENT, this.underlying[i]);
            }
            result += FMT_CLOSING;
        }
        return result;
    }

} // class DynamicArray
