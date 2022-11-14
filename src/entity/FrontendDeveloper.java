package entity;

public class FrontendDeveloper extends SoftwareSpecialist {
    public FrontendDeveloper() {
    }

    public FrontendDeveloper(String name, String email, String phone, int yearsOfExperience) {
        super(name, email, phone, yearsOfExperience);
    }

    @Override
    public void doWork() {
        System.out.println("Doing frontend development");
    }
}
