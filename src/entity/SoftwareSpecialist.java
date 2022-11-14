package entity;

public abstract class SoftwareSpecialist extends WhiteCollar {
    public SoftwareSpecialist() {
    }

    public SoftwareSpecialist(String name, String email, String phone, int yearsOfExperience) {
        super(name, email, phone, yearsOfExperience);
    }
    // this class would still be abstract since software specialists are specified!

    @Override
    public int hourlyPay() {
        return yearsOfExperience * 7;
    }
}
