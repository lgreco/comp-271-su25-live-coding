public class Stack<E extends Comparable<E>> extends alt_GenericDynamicArray<E> implements Xifo<E>, Lifo<E> {

    public int compareTo(Stack<E> other) {
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

    public void push(E e) {
    }

}
