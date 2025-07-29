import java.util.Stack;

public class BinarySearchTree {

    private TreeNode root;
    private int totalNodes;

    public BinarySearchTree() {
        this.root = null;
        this.totalNodes = 0;
    }

    public void add(TreeNode newNode) {
        if (this.root == null) {
            this.root = newNode;
        } else {
            TreeNode current = this.root;
            TreeNode parent = null;
            boolean duplicate = false;
            while (current != null && !duplicate) {
                parent = current;
                if (newNode.compareTo(current) < 0) {
                    current = current.getLeft();
                } else if (newNode.compareTo(current) > 0) {
                    current = current.getRight();
                } else {
                    duplicate = !duplicate;
                }
            }
            if (!duplicate) {
                if (newNode.compareTo(parent) < 0) {
                    parent.setLeft(newNode);
                } else {
                    parent.setRight(newNode);
                }
                this.totalNodes += 1;
            }
        }
    } // method add

    public void inOrder() {
        Stack<TreeNode> stack = new Stack<>();
        // Prime stack
        //stack.push(this.root);
        TreeNode current = this.root;
        while (current != null || !stack.isEmpty()) {
            while (current !=null) {
             stack.push(current);
             current = current.getLeft();   
            }
            current = stack.pop();
            System.out.println(current);
            current = current.getRight();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        String source = "now is the winter of our discontent made glorius summer by this son of york";
        String[] words = source.split(" ");
        for (String word : words) {
            TreeNode treeNode = new TreeNode(word);
            tree.add(treeNode);
        }
        tree.inOrder();
    }
}
