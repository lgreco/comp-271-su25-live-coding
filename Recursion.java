public class Recursion {

    static long factorial(long n) {
        long result;
        if (n == 0 || n == 1) {
            result = 1;
        } else {
            result = n * factorial(n - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.printf("\n%,d\n",factorial(21L));
    }
}
