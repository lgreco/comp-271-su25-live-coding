package miscArchives;
/**
 * A Student is a Person. So this class inherits its basic form and structure
 * from class Person. It differs from Person in that it has an additional
 * attribute: the student's major. Not every Person has a major -- that's why we
 * didn't include this field in class Person. But every student has a major.
 */
public class Student extends Person {

    /**
     * In addition to the Person fields inherited here, Student objects has this
     * field to capture a student's academic major.
     */
    private String major;

    /**
     * Almost full constructor. The constructor accepts values for fields that are
     * not explicitly defined in this class. It passes these values to the
     * constructor for the super class (Person). Then it assigns a value to this
     * object's field.
     */
    public Student(String firstName, String middleName, String lastName, int yearBorn, String major) {
        // Call the super class' constructor
        super(firstName, middleName, lastName, yearBorn);
        // Add the major to the newly instatiated object
        this.major = major;
    } // constructor Student

    /** Quick demo. */
    public static void main(String[] args) {
        Student student = new Student("Leo", "J", "Irakliotis", 1967, "Twin Engine");

        System.out.println(student);
    }

}
