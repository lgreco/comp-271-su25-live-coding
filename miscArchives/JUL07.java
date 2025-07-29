package miscArchives;
public class JUL07 {

    static final int ASCII_A = (int) 'A';
    static final int ASCII_a = (int) 'a';
    static final int LETTERS = 26;

    static boolean is_alphabetical(char toCheck) {
        /*
         * return ((toCheck >= 'A' && toCheck <= 'Z') ||
         * (toCheck >= 'a' && toCheck <= 'z'));
         */
        int asciiToCheck = (int) toCheck;
        boolean isUpper = (asciiToCheck >= ASCII_A && asciiToCheck <= ASCII_A + LETTERS);
        boolean isLower = (asciiToCheck >= ASCII_a && asciiToCheck <= ASCII_a + LETTERS);
        return (isLower || isUpper);
    }

    public static void main(String[] args) {
        System.out.println(is_alphabetical('/'));
        System.out.println(is_alphabetical('h'));
    }
}
