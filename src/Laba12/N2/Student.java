package N2;

public class Student extends Human {

    protected String facultyNumber;

    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(String facultyNumber) {

        if (facultyNumber.length() < 5 || facultyNumber.length() > 10)
            throw new IllegalArgumentException("Faculty number should be from 5 to 10 numbers");
        else
            this.facultyNumber = facultyNumber;
    }

    public String toString() {
        return
                "First name: " + this.firstName + "\n"
                + "Last name: " + this.lastName + "\n"
                + "Faculty number: " + this.facultyNumber;
    }
}
