import java.util.Arrays; // for printing only using toString()

/**
 * Simple object implemention of the minimum-heap
 */
public class MinHeap {

    /** Underlying array */
    private int[] array;

    /** Utilization counter for the array */
    private int usage;

    /** Default array size constant */
    private static final int DEFAULT_SIZE = 4;

    /**
     * Default constructor. It calls the basic constructor passing the object's
     * default size to it.
     */
    public MinHeap() {
        this(DEFAULT_SIZE); // call basic constructor with default size
    } // default constructor

    /**
     * Basic constructor. It initializes the underlying array at the default size.
     * Then it checks the requested size to ensure it's a legit value and if so, it
     * reinitializes the underlying array at the requested size. The method also
     * sets the current usage of the underlying array to 0, indicating that nothing
     * has been added to it yet.
     * 
     * @param size int with the requested size for the underlying array.
     */
    public MinHeap(int size) {
        this.array = new int[DEFAULT_SIZE];
        if (size > 0) {
            this.array = new int[size];
        }
        this.usage = 0;
    } // basic constructor

    /** Accessor for size */
    public int getSize() {
        return this.array.length;
    }

    /** Getter method ... accessor for usage */
    public int getUsage() {
        return this.usage;
    }

    /**
     * Remove and return the smallest value from the min heap and adjust the
     * underlying array's size as needed.
     * 
     * @return int with smallest value of the underlying array.
     */
    public int getSmallest() {
        // Assume first element is the smallest element
        int smallest_index = 0;
        // Scan the rest of the elements to find the smallest value
        for (int i = 1; i < this.array.length; i++) {
            if (this.array[i] < this.array[smallest_index]) {
                smallest_index = i;
            }
        }
        // Now smallest_index points to the truly smallest element in the array.
        // Let's grab it so that we can return it at the end
        int smallest_value = this.array[smallest_index];
        // Remove the smallest element from the array by moving all the elements to its
        // right one position to the right in a temporary array that is one size smaller
        int[] temporary = new int[this.array.length - 1];
        // First copy the elements before the smallest position
        for (int i = 0; i < smallest_index; i++) {
            temporary[i] = this.array[i];
        }
        // Now copy the elements after the smallest position
        for (int i = smallest_index + 1; i < this.array.length; i++) {
            temporary[i - 1] = this.array[i];
        }
        // Update the usage of the underlying array;
        this.usage = this.usage - 1;
        // Done!
        return smallest_value;
    } // method getSmallest

    /**
     * Adds a new value to the Min Heap. The underlying array is resized to
     * accomodate the new element and the usage count is updated accordingly.
     * 
     * @param value int new item to be added to the Min Heap
     */
    public void add(int value) {
        // Create a temporary array, slighly larger than the underlying array
        int[] temporary = new int[this.array.length + 1];
        // Copy the current contents of the underlying array to the temporary one
        for (int i = 0; i < this.array.length; i++) {
            temporary[i] = this.array[i];
        }
        // Add the new item to the last place of the temporary array
        temporary[this.array.length] = value;
        // Update usage
        this.usage = this.usage + 1;
        // Replace underlying array with temporary array and we are done
        this.array = temporary;
    } // method add

} // class MinHeap
