public class Queue<E extends Comparable<E>> extends GenericDynamicArray<E> implements Xifo<E>, Fifo<E> {

    public void push(E e) {
    }

    public int compareTo(Queue<E> other) {
        return this.getOccupancy()-other.getOccupancy();
    }

    public E peek() {
        return null;
    }

    public E pop() {
        return null;
    }

    public String toString() {
        return null;
    }

}
