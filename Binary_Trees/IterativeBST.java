package Binary_Trees;

public class IterativeBST {

    TreeNode root;

    IterativeBST() {
        this.root = null;
    }

    void insert(String value) {
        // Create a new node with the data to add
        TreeNode newNode = new TreeNode(value);
        if (this.root == null) {
            this.root = newNode;
        } else {
            // Need to traverse the tree L/R as needed
            TreeNode cursor = this.root;
            TreeNode parent = null; // parent node of cursor
            boolean duplicate = false;
            // traversal loop
            while (cursor != null && !duplicate) {
                parent = cursor;
                if (newNode.value.compareTo(cursor.value) < 0) {
                    cursor = cursor.left; // go left
                } else if (newNode.value.compareTo(cursor.value) > 0) {
                    cursor = cursor.right; // go right
                } else {
                    duplicate = !duplicate;
                }
            }
            // At this point, if not duplicate, cursor has found a null
            // child that belongs to node parent
            if (!duplicate) {
                // For sure the new node will go under parent but we need to find first if it's
                // the left or the right child.
                if (newNode.value.compareTo(parent.value) < 0) {
                    parent.left = newNode;
                } else {
                    parent.right = newNode;
                }
            }
        }
    } // method insert

} // class IterativeBST
