import java.util.ArrayList;

public class Staff {
    private ArrayList<StaffMember> staffList;

    public Staff() {
        staffList = new ArrayList<>();

        staffList.add(new Volunteer("An", "TP.HCM", "0123"));
        staffList.add(new Employee("Binh", "Ha Noi", "0456", "111", 5000));

        Executive ex = new Executive("Cuong", "Da Nang", "0789", "222", 10000);
        ex.awardBonus(2000);
        staffList.add(ex);

        Hourly ho = new Hourly("Dung", "Can Tho", "0999", "333", 100);
        ho.addHours(40);
        staffList.add(ho);
    }

    public void payday() {
        for (StaffMember staff : staffList) {
            System.out.println(staff);
            double amount = staff.pay();
            System.out.println("Luong: " + amount);
            System.out.println("----------------------");
        }
    }
}