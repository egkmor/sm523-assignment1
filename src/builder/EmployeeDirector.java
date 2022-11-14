package builder;

import entity.Employee;

public class EmployeeDirector {
    private EmployeeBuilder employeeBuilder;

    public EmployeeDirector(EmployeeBuilder employeeBuilder) {
        this.employeeBuilder = employeeBuilder;
    }

    public Employee getEmployee() {
        return this.employeeBuilder.getEmployee();
    }

    public void buildEmployee(String name, String email, String phone, int yearsOfExperience) {
        this.employeeBuilder.buildName(name);
        this.employeeBuilder.buildEmail(email);
        this.employeeBuilder.buildPhone(phone);
        this.employeeBuilder.buildYearsOfExperience(yearsOfExperience);
        this.employeeBuilder.buildOffice();
    }
}
