package abstraction.employee_payroll.employee;

public class FullTime extends Employee {
    public FullTime(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        calculateSalary(salary);
        System.out.println("Inside FullTimeEmployee Constructor");
    }

    public double getSalary() {
        System.out.println("Inside FullTimeEmployee getSalary Method");
        return super.getSalary();
    }

    @Override
    protected void calculateSalary(double salary) {
        setSalary(salary);
    }
}
