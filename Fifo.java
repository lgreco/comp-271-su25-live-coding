public interface Fifo<E> {

    /**
     * Adds an element to the first available position of the underlying data
     * structure. Such position is usually indicated by the number of items already
     * placed in the data structure.
     * 
     * @param e E object to add.
     */
    void add(E e);
} // interface Fifo
