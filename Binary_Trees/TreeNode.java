package Binary_Trees;

public class TreeNode  {

    // Class fields must be private - exception
    // here for illustrating tree construction.
    
    String value;
    TreeNode left;
    TreeNode right;

    public TreeNode(String value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}