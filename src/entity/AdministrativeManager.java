package entity;

public class AdministrativeManager extends Manager {
    public AdministrativeManager() {
    }

    public AdministrativeManager(String name, String email, String phone, int yearsOfExperience) {
        super(name, email, phone, yearsOfExperience);
    }

    @Override
    public void doWork() {
        System.out.println("Doing administrative management!");
    }
}
