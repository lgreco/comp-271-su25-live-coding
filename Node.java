public class Node {

    private String value;
    private Node next;
    private Node previous;

    public Node(String value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    //public String toString() {
    //    return this.value;
    // }

    public static void main(String[] args) {
        Node newNode = new Node("our first real node");
        System.out.println(newNode);
    }
}
