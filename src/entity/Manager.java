package entity;

public abstract class Manager extends WhiteCollar {
    public Manager() {
    }

    @Override
    public String division() {
        return "Manager Division";
    }

    public Manager(String name, String email, String phone, int yearsOfExperience) {
        super(name, email, phone, yearsOfExperience);
    }

    @Override
    public int hourlyPay() {
        return yearsOfExperience * 8;
    }
    // this class would still be abstract managers are specified!

}
