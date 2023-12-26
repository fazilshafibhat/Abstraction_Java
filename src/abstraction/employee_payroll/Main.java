package abstraction.employee_payroll;

import abstraction.employee_payroll.employee.FullTime;
import abstraction.employee_payroll.employee.Hourly;

public class Main {
    public static void main(String[] args) {
        Payroll payroll = new Payroll();

        payroll.add(new FullTime("John", "Doe", 6000));
        payroll.add(new FullTime("Jane", "Doe", 6500));
        payroll.add(new Hourly("Jenifer", "Smith", 200, 50));
        payroll.add(new Hourly("David", "Wilson", 150, 100));
        payroll.add(new Hourly("Kevin", "Miller", 100, 150));

        payroll.print();
    }
}
