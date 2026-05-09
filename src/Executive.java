public class Executive extends Employee {
    private double bonus;

    public Executive(String name, String address, String phone,
                     String socialSecurityNumber, double payRate) {
        super(name, address, phone, socialSecurityNumber, payRate);
        bonus = 0;
    }

    public void awardBonus(double execBonus) {
        bonus += execBonus;
    }

    @Override
    public double pay() {
        double salary = payRate + bonus;
        bonus = 0;
        return salary;
    }
}