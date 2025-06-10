public class TrainLine {

    private String name;
    private Station head;

    /** Basic constructor */
    public TrainLine(String name) {
        this.name = name;
        this.head = null;
    }

    /** How to add a new station to this line */
    public void add(String name) {
        Station newStation = new Station(name);
        if (this.head == null) {
            // No stations exist in this line. Make this new station
            // the head station of the line
            this.head = newStation;
        } else {
            // The line has at least one station (the head station).
            // Find the last station and make its next station the new one.
            Station cursor = this.head;
            while (cursor.hasNext()) {
                cursor = cursor.getNext();
            }
            // Cursor is now at the last station of the line
            cursor.setNext(newStation);
        }
    }

    public String toString() {
        if (this.head == null) {
            return "The train line is empty";
        } else {
            // do something else, for example
             String stations = "";
             Station cursor = this.head;
             while (cursor != null) {
                stations = stations + "-->" + cursor.getName();
                cursor = cursor.getNext();
             }
             return "The line has the following stations:\n" + stations;
        }
    }
}
