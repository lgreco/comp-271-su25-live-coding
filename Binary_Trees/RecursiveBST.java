package Binary_Trees;

public class RecursiveBST {

    TreeNode root;

    RecursiveBST() {
        this.root = null;
    }

    public void insert(String value) {
        this.root = insert(value, this.root);
    }

    private TreeNode insert(String value, TreeNode entryNode) {
        TreeNode result = entryNode;
        if (entryNode == null) {
            // place new node here
            result = new TreeNode(value);
        } else if (entryNode.value.compareTo(value) < 0) {
            // go to the right because value > entryNode.value
            entryNode.right = insert(value, entryNode.right);
        } else if (entryNode.value.compareTo(value) > 0) {
            // go to the left because value < entryNode.value
            entryNode.left = insert(value, entryNode.left);
        }
        return result;
    }

}
