package entity;

public class BlueCollar extends Employee {
    public BlueCollar() {
    }

    public BlueCollar(String name, String email, String phone, int yearsOfExperience) {
        super(name, email, phone, yearsOfExperience);
    }

    @Override
    public String division() {
        return "Blue Collar Division";
    }

    @Override
    public int hourlyPay() {
        return yearsOfExperience * 5;
    }

    @Override
    public void doWork() {
        System.out.println("Working a blue collar job!");
    }
}
