package miscArchives;
/**
 * A class to model a person as an object with a name, a birth year, and some
 * identification number. This could be a social securit number for a larger
 * population or some university ID code.
 */
public class Person {

    /** Object attributes */
    private String firstName;
    private String middleName;
    private String lastName;
    private int yearBorn;
    private String UVID;

    /**
     * Almost full constructor. It excluded UVID because we may want to add it
     * later.
     */
    public Person(String firstName, String middleName, String lastName, int yearBorn) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.yearBorn = yearBorn;
    }

    /** Add an ID code for this object */
    public void setUVID(String uVID) {
        this.UVID = uVID;
    }

    /** Basic accessor (getter) methods */

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public String getUVID() {
        return UVID;
    }

    /**
     * String representation for the object Person. This method overrides the
     * default toString() method inherited from object Object. This inheritance is
     * automatic for every class we create in Java.
     */
    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
                + ", yearBorn=" + yearBorn + ", UVID=" + UVID + "]";
    } // method toString

} // class Person
