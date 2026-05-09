public class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

    public StaffMember(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String toString() {
        return "Name: " + name + ", Address: " + address + ", Phone: " + phone;
    }

    public double pay() {
        return 0.0;
    }
}