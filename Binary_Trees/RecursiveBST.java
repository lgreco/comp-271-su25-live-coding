package Binary_Trees;

public class RecursiveBST {

    TreeNode root;

    /** Trivial constructor */
    RecursiveBST() {
        this.root = null;
    } // constructor

    /**
     * Method to find a place to add a new node below a entry node in a binary
     * search tree. After the new node is added, the method returns the entry node
     * since we added somewhere below it a new node.
     * 
     * @param value     String to encapsulate in the new node to add
     * @param entryNode Node where we'll attempt to insert the new node. If the
     *                  entry node is not null, we'll explore its left or right
     *                  children for placement.
     * @return the entry node, that may have now a new descendant.
     */
    private TreeNode insert(String value, TreeNode entryNode) {
        // Node to return
        TreeNode result = entryNode;
        // Check if the desired entry position is available. If it is take it otherwise
        // slide to the left or the right child of the entry node.
        if (entryNode == null) {
            // Entry node is available. That was easy.
            result = new TreeNode(value);
        } else if (entryNode.value.compareTo(value) < 0) {
            // Entry node is not available, and the new node contains a string larger than
            // the one in the entry node, so we slide to the right. We make the right child
            // of the entry node the new desired entry point and we try again.
            entryNode.right = insert(value, entryNode.right);
        } else if (entryNode.value.compareTo(value) > 0) {
            // Entry node is not available, and the new node contains a string smaller than
            // the one in the entry node, so we slide to the left. We make the left child
            // of the entry node the new desired entry point and we try again.
            entryNode.left = insert(value, entryNode.left);
        }
        // Done
        return result;
    } // method insert

    /**
     * This is a helper method to start the insertion recursion. Data in the binary
     * search tree are placed through the root of the tree. This method takes a new
     * string value we wish to enter to the tree and begins the recursive insertion
     * from the root node.
     * 
     * @param value String with new value to add to the tree.
     */
    public void insert(String value) {
        // When the recursive insertion ends, it will return a new root for the tree;
        // this new root is very much like the original root, only with a new node
        // containing the string value;
        this.root = insert(value, this.root);
    } // method insert

} // class RecursiveBST
