public interface Xifo<E> {

    /**
     * Sneak preview of the front element of the underlying data structure. The
     * element itself is not removed from the underlying data structure
     * 
     * @return E element at the front of the underlying data structure; if the data
     *         structure is empty, method returns null.
     */
    public E peek();

    /**
     * Remove and return the first item in the underlying data structure.
     * 
     * @return E item at the front of the underlying data structure. If empty,
     *         return null.
     */
    public E pop();

    /**
     * String representation for the implementing object
     * 
     * @return String with information about the implementing object
     */
    public String toString();

} // interface Xifo
