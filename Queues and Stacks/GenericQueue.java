public class GenericQueue<E extends Comparable<E>> extends alt_GenericDynamicArray<E> implements Xifo<E>, Fifo<E> {
    //             ========================
    //             This means that only objects
    //             with compareTo method in them
    //             can be used here.

    public void push(E e) {
    }

    public int compareTo(GenericQueue<E> other) {
        return this.getOccupancy()-other.getOccupancy();
    }

    public E peek() {
        return this.getFirst(); // ask DynamicArray to return [0] via method
    }

    public E pop() {
        return null;
    }

    public String toString() {
        return null;
    }

}
