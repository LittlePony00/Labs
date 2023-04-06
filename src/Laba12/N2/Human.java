package Laba12.N2;

public class Human {
    protected String firstName;
    protected String lastName;

    public Human (String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    protected void setFirstName(String firstName) {
        if (!Character.isUpperCase(firstName.charAt(0)))
            throw new IllegalArgumentException("First character should be with upper case");
        else if (firstName.hashCode() == 0)
            throw new IllegalArgumentException("First name should not be empty");
        else if (firstName.length() < 4)
            throw new IllegalArgumentException("First name length should be more than 3");
        else
            this.firstName = firstName;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (!Character.isUpperCase(lastName.charAt(0)))
            throw new IllegalArgumentException("First character should be with upper case");
        else if (lastName.hashCode() == 0)
            throw new IllegalArgumentException("First name should not be empty");
        else if (lastName.length() < 3)
            throw new IllegalArgumentException("Last name should be more than 3");
        else
            this.lastName = firstName;
    }

}
