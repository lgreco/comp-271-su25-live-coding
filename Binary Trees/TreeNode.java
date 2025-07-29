public class TreeNode implements Comparable<TreeNode> {

    private String value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(String value) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public String getValue() {
        return value;
    }

    public boolean hasLeft() {
        return this.left != null;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public boolean hasRight() {
        return this.right != null;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public String toString() {
        return this.value;
    }

    public int compareTo(TreeNode other) {
        return this.value.compareTo(other.getValue());
    }

}