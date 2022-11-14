package builder;

import entity.BackendDeveloper;
import entity.Employee;

public class BackendDeveloperBuilder implements EmployeeBuilder {

    private Employee employee;

    public BackendDeveloperBuilder() {
        this.employee = new BackendDeveloper();
    }

    @Override
    public void buildName(String name) {
        employee.setName(name);
    }

    @Override
    public void buildEmail(String email) {
        employee.setEmail(email);
    }

    @Override
    public void buildPhone(String phone) {
        employee.setPhone(phone);
    }

    @Override
    public void buildYearsOfExperience(int yearsOfExperience) {
        employee.setYearsOfExperience(yearsOfExperience);
    }

    @Override
    public void buildOffice() {
        employee.setOffice("4th Floor");
    }

    @Override
    public Employee getEmployee() {
        return employee;
    }

}
