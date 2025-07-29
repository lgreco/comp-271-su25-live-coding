package Binary_Trees;

public class Implement_RecursiveBST {

    public static void main(String[] args) {
        RecursiveBST tree = new RecursiveBST();
        tree.insert("now");
        tree.insert("is");
        tree.insert("the");
        System.out.println(tree.root.left.right);
    }
}
