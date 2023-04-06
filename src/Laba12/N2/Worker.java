package Laba12.N2;

public class Worker extends Human{

    protected Double weekSalary;
    protected Double workHoursPerDay;

    public Worker(String firstName, String lastName, Double weekSalary, Double workHoursPerDay) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHoursPerDay(workHoursPerDay);
    }

    public Double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(Double weekSalary) {
        if (weekSalary < 10)
            throw new IllegalArgumentException("Week salary should be more 10");
        else
            this.weekSalary = weekSalary;
    }

    public Double getWorkHoursPerDay() {
        return workHoursPerDay;
    }

    public void setWorkHoursPerDay(Double workHoursPerDay) {
        if (workHoursPerDay < 1 || workHoursPerDay > 12)
            throw new IllegalArgumentException("Work hours per day should be in [1..12]");
        else
            this.workHoursPerDay = workHoursPerDay;
    }

    public String toString() {
        return "First name: " + this.firstName + "\n"
                + "Last name: " + this.lastName + "\n"
                + "Week salary: " + this.weekSalary + "\n"
                + "Hours per day: " + this.workHoursPerDay + "\n"
                + "Salary per hour: " + (this.weekSalary / 7 / this.workHoursPerDay);
    }

}
