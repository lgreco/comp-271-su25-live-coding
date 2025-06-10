public class Station {

    private String name; 
    private Station next;

    /** Basic constructor */
    public Station(String name) {
        this.name = name;
        this.next = null;
    }

    /** Set the next station (setter method aka mutators) */
    public void setNext(Station nextStation) {
        this.next = nextStation;
    }

    /** Predicate accessor (getter method) */
    public boolean hasNext() {
        return this.next != null;
    }

    /** Literal accessor (also a getter method) */ 
    public Station getNext() {
        return this.next;
    }

    /** Getter method for the station's name */
    public String getName() {
        return this.name;
    }
}
