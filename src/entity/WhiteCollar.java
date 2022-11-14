package entity;

public abstract class WhiteCollar extends Employee {
    // this class would still be abstract since white collar workers are specified!

    public WhiteCollar() {
    }

    public WhiteCollar(String name, String email, String phone, int yearsOfExperience) {
        super(name, email, phone, yearsOfExperience);
    }

    @Override
    public String division() {
        return "White Collar Division";
    }
}
