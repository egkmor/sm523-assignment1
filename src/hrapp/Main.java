package hrapp;

import builder.BackendDeveloperBuilder;
import builder.EmployeeDirector;
import entity.Employee;
import entity.TechnicalManager;
import enums.EmployeeType;
import factory.EmployeeFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------- Factory Pattern ---------");
        EmployeeFactory factory = EmployeeFactory.getEmployeeFactory();
        TechnicalManager employee = (TechnicalManager) factory.getEmployee(EmployeeType.TECHNICAL_MANAGER);

        employee.doWork();
        System.out.println("Division: " + employee.division());

        System.out.println("-----------------------------------");
        System.out.println("--------- Builder Pattern ---------");

        BackendDeveloperBuilder backendDeveloperBuilder = new BackendDeveloperBuilder();
        EmployeeDirector employeeDirector = new EmployeeDirector(backendDeveloperBuilder);
        employeeDirector.buildEmployee("gorkem", "gorkem@work.com", "123456789", 2);
        Employee gorkem = employeeDirector.getEmployee();
        System.out.println("Employee name: " + gorkem.getName());
        System.out.println("Employee email: " + gorkem.getEmail());
        System.out.println("Employee phone: " + gorkem.getPhone());
        System.out.println("Employee pay: " + gorkem.hourlyPay());

        System.out.println("-----------------------------------");

    }
}