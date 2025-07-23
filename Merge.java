import java.util.Arrays;

public class Merge {

    /**
     * Method accepts two arrays that are already sorted in ascending order and
     * merges them in an so sorted output array.
     * 
     * @param A int[] sorted array
     * @param B int[] sorted array
     * @return int[] that contains the elements from A and B also sorted.
     */
    static int[] merge(int[] A, int[] B) {
        int[] C = new int[A.length + B.length];
        // Initialize points to active leftmost elements for the three arrays
        int i = 0, j = 0, k = 0; // A, B, C indices ... not good style
        // While both arrays have active leftmost elements to consider
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                C[k] = A[i];
                i += 1;
            } else {
                C[k] = B[j];
                j += 1;
            }
            k += 1;
        }
        // In case array A has elements to process
        while (i < A.length) {
            C[k] = A[i];
            i += 1;
            k += 1;
        }
        // In case array B has elements to process
        while (j < B.length) {
            C[k] = B[j];
            j += 1;
            k += 1;
        }
        return C;
    } // method merge

    /** Assume input array length = 2^p */
    static int[] mergeSort(int[] array) {
        int[] result;
        System.out.printf("\n\nReceived array %s", Arrays.toString(array));
        if (array.length == 1) {
            System.out.printf("\n\tArray has length 1; return as is");
            result = new int[1];
            result[0] = array[0];
        } else {
            System.out.printf("\n\tArray must be split in halves.");
            // need to split input array in halves
            int mid = array.length / 2;
            // create the new left/right halves
            int[] left = new int[mid];
            int[] right = new int[mid];
            // populate left half
            for (int i = 0; i < mid; i++) {
                left[i] = array[i];
            }
            // populate right half ... index i-mid for 0, 1, ... for right array
            for (int i = mid; i < array.length; i++) {
                right[i - mid] = array[i];
            }
            System.out.printf("\n\tLeft half is %s", Arrays.toString(left));
            System.out.printf("\n\tRight half is %s", Arrays.toString(right));
            System.out.printf("\n\tPassing halves back to this method.\n");
            // Now we have our halves
            int[] sortedLeft = mergeSort(left);
            int[] sortedRight = mergeSort(right);
            System.out.printf("\n\tAbout to merge %s and %s",
                    Arrays.toString(sortedLeft), Arrays.toString(sortedRight));
            result = merge(sortedLeft, sortedRight);
        }
        System.out.printf("\nMethod is returning %s",
                Arrays.toString(result));
        return result;
    } // method mergeSort

    public static void main(String[] args) {
        int[] test = { 4,3,2,6};
        int[] sortedTest = mergeSort(test);
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(sortedTest));
    }
}
