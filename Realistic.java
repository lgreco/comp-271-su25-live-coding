import java.util.Arrays; // for printing array

/**
 * A class to demonstrate minimum heap operations using arrays
 */
public class Realistic {

    /** Set up our test array. */
    static int[] arr = { 10, -5, 11, 2 };

    /**
     * Scan the entire array to find and remove its smallest value.
     * The method uses array arr[] created above.
     * 
     * @return int with the smallest value in array arr
     */
    public static int getSmallest() {
        // Assume smallest is first element
        int smallest_index = 0;
        // Scan the remaining elements, replacing the position of the smallest element
        // with the position of any element found to be smaller.
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[smallest_index]) {
                // found new smallest, update index
                smallest_index = i;
            }
        }
        // When loop is done, smallest_index points to smallest element. Save it in a
        // variable so that we can return its value when we are done.
        int result = arr[smallest_index];
        // Prepare to shrink the processed array by one element, effectively removing
        // its smallest element. A temporary array will hold the remaining elements.
        int[] temporary = new int[arr.length - 1];
        // Copy elements before smallest to temporary
        for (int i = 0; i < smallest_index; i++) {
            temporary[i] = arr[i];
        }
        // Copy elements after smallest to temporary; [i-1] to ensure
        // contiguity in temporary while skipping smallest in arr
        for (int i = smallest_index + 1; i < arr.length; i++) {
            temporary[i - 1] = arr[i];  //
        }
        arr = temporary; // array shorted by 1 (removing smallest elem)
        return result; // smallest element
    } // method getSmallest

    /**
     * Adds a new value at the end of the underlying array, after resizing it first.
     * 
     * @param value int to add to the underlying array
     */
    public static void add(int value) {
        // Create temporary array larger than current underlying array
        int[] temporary = new int[arr.length+1];
        // Copy contents from underlying array to temporary
        for (int i = 0; i < arr.length; i++) {
            temporary[i] = arr[i];
        }
        // Add new value to end of temporary array
        temporary[arr.length] = value;
        // Replace underlying array with temporary
        arr = temporary;
    } // method add

    /** Driver/simple test code */
    public static void main(String[] args) {
        System.out.printf("\n\nArray before removal of smallest element: %s",
                Arrays.toString(arr));
        System.out.printf("\nSmallest element found: %d", getSmallest());
        System.out.printf("\nArray after removal of smallest element: %s\n\n",
                Arrays.toString(arr));
    } // method main
} // class Realistic