public class CastingObjectDemo {
    public static void main(String[] args) {
        Object[] objects = new Object[2];
        String[] words = (String[]) objects;
        objects[0] = new String("Hello");
        words[1] = new String("world");
        System.out.printf("\n\n%s %s",
        words[0], words[1]);
    }
}
