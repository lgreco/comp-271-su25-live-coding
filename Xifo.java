public interface Xifo<E> {

    /**
     * Sneak preview of the front element of the underlying data structure. The
     * element itself is not removed from the underlying data structure
     * 
     * @return E element at the front of the underlying data structure; if the data
     *         structure is empty, method returns null.
     */
    E peek();

    /**
     * Remove and return the first item in the underlying data structure. We should
     * ensure that the remainting items in the data structure are positioned so the
     * next item in line becomes the first item for subsequent removal.
     * 
     * @return E item at the front of the underlying data structure. If empty,
     *         return null.
     */
    E pop();

    /**
     * String representation for the implementing object
     * 
     * @return String with information about the implementing object
     */
    String toString();

} // interface Xifo
