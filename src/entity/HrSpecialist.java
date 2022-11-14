package entity;

public class HrSpecialist extends WhiteCollar {
    public HrSpecialist(String name, String email, String phone, int yearsOfExperience) {
        super(name, email, phone, yearsOfExperience);
    }

    public HrSpecialist() {
    }

    @Override
    public int hourlyPay() {
        return yearsOfExperience * 6;
    }

    @Override
    public void doWork() {
        System.out.println("Working as a HR Specialist!");
    }
}
