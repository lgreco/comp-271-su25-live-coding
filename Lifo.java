public interface Lifo<E> {

    /**
     * The main characteristic of the LIFO process is that new data are "pushed"
     * into the underlying data structure from its front. Pushing, here, refers to
     * shifting all elements one position tot he right, to make room for the new
     * element.
     * 
     * @param e E object to enter to the underlying data structure.
     */
    public void push(E e);

} // interface Lifo
