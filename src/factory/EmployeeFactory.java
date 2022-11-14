package factory;

import entity.AdministrativeManager;
import entity.BackendDeveloper;
import entity.BlueCollar;
import entity.Employee;
import entity.FrontendDeveloper;
import entity.HrSpecialist;
import entity.SoftwareArchitect;
import entity.TechnicalManager;
import enums.EmployeeType;

public class EmployeeFactory {

    private static EmployeeFactory factory;

    private EmployeeFactory() {
    }

    public static EmployeeFactory getEmployeeFactory() {
        if (factory != null) {
            return factory;
        }
        factory = new EmployeeFactory();

        return factory;
    }

    public Employee getEmployee(EmployeeType type) {

        if (EmployeeType.ADMINISTRATIVE_MANAGER.equals(type)) {
            return new AdministrativeManager();
        }
        if (EmployeeType.BLUE_COLLAR.equals(type)) {
            return new BlueCollar();
        }
        if (EmployeeType.BACKEND_DEVELOPER.equals(type)) {
            return new BackendDeveloper();
        }
        if (EmployeeType.HR_SPECIALIST.equals(type)) {
            return new HrSpecialist();
        }
        if (EmployeeType.FRONTEND_DEVELOPER.equals(type)) {
            return new FrontendDeveloper();
        }
        if (EmployeeType.SOFTWARE_ARCHITECT.equals(type)) {
            return new SoftwareArchitect();
        }
        if (EmployeeType.TECHNICAL_MANAGER.equals(type)) {
            return new TechnicalManager();
        }

        return null;
    }
}
