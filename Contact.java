package Test;

public class Contact {
    protected String name;
    protected String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "name= " + name + ", phone= " + phone ;
    }
}
