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
}
