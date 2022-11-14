package entity;

public class SoftwareArchitect extends SoftwareSpecialist {
    public SoftwareArchitect() {
    }

    public SoftwareArchitect(String name, String email, String phone, int yearsOfExperience) {
        super(name, email, phone, yearsOfExperience);
    }

    @Override
    public void doWork() {
        System.out.println("Doing software architecture");
    }
}
