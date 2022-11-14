package entity;

public class BackendDeveloper extends SoftwareSpecialist {
    public BackendDeveloper() {
    }

    public BackendDeveloper(String name, String email, String phone, int yearsOfExperience) {
        super(name, email, phone, yearsOfExperience);
    }

    @Override
    public void doWork() {
        System.out.println("Doing backend development");
    }
}
