package builder;

import entity.Employee;
import entity.HrSpecialist;

public class HrSpecialistBuilder implements EmployeeBuilder {

    private Employee employee;

    public HrSpecialistBuilder() {
        this.employee = new HrSpecialist();
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
        employee.setOffice("5th Floor");
    }

    @Override
    public Employee getEmployee() {
        return employee;
    }






    /*
    public class IglooHouseBuilder implements HouseBuilder {

    private House house;

    public IglooHouseBuilder() {
        this.house = new House();
    }


    @Override
    public void buildBasement() {
        house.setBasement("Ice Bars");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Ice Blocks");
    }

    @Override
    public void buildRoof() {
        house.setInterior("Ice Carvings");
    }

    @Override
    public void buildInterior() {
        house.setRoof("Ice Dome");
    }

    @Override
    public House getHouse() {

        return this.house;
    }
}
     */
}
