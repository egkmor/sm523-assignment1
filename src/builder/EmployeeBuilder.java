package builder;

import entity.Employee;

public interface EmployeeBuilder {
    public void buildName(String name);

    public void buildEmail(String email);

    public void buildPhone(String phone);

    public void buildYearsOfExperience(int yearsOfExperience);

    public void buildOffice();

    public Employee getEmployee();
}
