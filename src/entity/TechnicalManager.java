package entity;

public class TechnicalManager extends Manager {
    public TechnicalManager() {
    }

    public TechnicalManager(String name, String email, String phone, int yearsOfExperience) {
        super(name, email, phone, yearsOfExperience);
    }

    @Override
    public void doWork() {
        System.out.println("Doing technical management!");
    }
}
