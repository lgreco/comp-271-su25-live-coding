/**
 * Illustrative Queue class that is based on (extends) the DynamicArray object.
 * This class must also implement the methods listed in interfaces Comparable,
 * Xifo, and Fifo. The last two interfaces are of our own design.
 */
public class Queue extends DynamicArray implements Comparable<Queue>, Xifo<String>, Fifo<String> {

    /** Fulfills the Comparable interface. */
    public int compareTo(Queue other) {
        return this.getOccupancy() - other.getOccupancy();
    }

    /** Partially fulfills the Xifo interface */
    public String peek() {
        return this.getFirst(); // ask DynamicArray to return [0] via method
    }

    /** Partially fulfills the Xifo interface */
    public String pop() {
        return null;
    }

    /** Partially fulfills the Xifo interface */
    public String toString() {
        return null;
    }

    /*
     * WHAT ABOUT INTERFACE Fifo? HOW/WHERE IS IT IMPLEMENTED?
     * 
     * Interface Fifo requires the implementation of a method with header
     * 
     * void add(E e);
     * 
     * where E, here, is String.
     * 
     * Class Queue (this class) extends class DynamicArray. Class DynamicArray has
     * an add method with header
     * 
     * add(String string)
     * 
     * This method fulfills the Fifo.add contract. There is no need for a separate
     * add method in class Queue since we inherit one from DynamicArray.
     */

} // class Queue
