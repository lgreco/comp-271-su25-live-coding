import java.util.Arrays; // for printing only using toString()

/**
 * Simple object implemention of the minimum-heap
 */
public class MinHeap {

    /** Underlying array */
    private int[] array;

    /** Utilization counter for the array */
    private int usage;

    /** Default array size constant */
    private static final int DEFAULT_SIZE = 4;

    /** Default constructor */
    public MinHeap() {
        this(DEFAULT_SIZE); //call basic constructor with default size
    } // default constructor

    /** Basic constructor */
    public MinHeap(int size) {
        this.array = new int[DEFAULT_SIZE];
        if (size > 0) {
            this.array = new int[size];
        } 
        this.usage = 0;
    } // basic constructor

    /** Accessor for size */
    public int getSize() {
        return this.array.length;
    }

    /** Getter method ... accessor  for usage */
    public int getUsage() {
        return this.usage;
    }

    public int getSmaller() {
        //...
    }

    public void add(int value) {
        //...
    }

} // class MinHeap
