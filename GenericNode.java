/**
 * Standard node class for single and double-linked lists. The node here is
 * written for String contents. Eventually it should be generalized for any kind
 * of contents.
 */
public class GenericNode<E> {

    /** Contents of node */
    private E value;
    /** Pointer to next node */
    private GenericNode<E> next;
    /** Pointer to previous node */
    private GenericNode<E> previous;

    /** Basic constructor assigns a value to the node and two null pointers */
    public GenericNode(E value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    } // Basic constructor


    /** Accessor for value */
    public E getValue() {
        return value;
    } // method getValue

    /** Mutator for next */
    public void setNext(GenericNode<E> next) {
        this.next = next;
    } // method setNext

    /** Mutator for previous */
    public void setPrevious(GenericNode<E> previous) {
        this.previous = previous;
    } // method setPrevious

    /**
     * Overrides the default Object.toString() method. Variables next and previous
     * below will resolve thanks to their instances of Node.toString() method.
     */
    @Override
    public String toString() {
        return "Node [value=" + value.toString() + "]";
    } // method toString

    /** Simple testing */
    public static void main(String[] args) {
        GenericNode<String> a = new GenericNode<String>("Hello");
    }
} // class Node
