public class DoubleLinkedList implements Comparable<DoubleLinkedList> {

    private static final String DEFAULT_NAME = "Whatever";

    private String name;
    private Node head;
    private Node tail;

    public DoubleLinkedList(String name) {
        this.name = name;
        this.head = null;
        this.tail = null;
    } // Basic constructor

    public DoubleLinkedList() {
        this(DEFAULT_NAME);
    } // default constructor

    // Always* write a toString method for your objects.
    // --------
    // * well, almost always ...
    public String toString() {
        return this.name;
    }

    /** Add a new node to the linked list */
    public void add(Node node) {
        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.setNext(node);
        }
        this.tail = node;
    }

    // overload method add to add a node by value
    public void add(String value) {}

    // implement the comparable interface
    public int compareTo(DoubleLinkedList other) {
        return -1234567;
    }
}
