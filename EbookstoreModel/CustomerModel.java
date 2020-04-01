package Ebookstore.EbookstoreModel;

public class CustomerModel {
    private int id;
    private String name;
    private String email;
    private String address;
    private String numberPhone;

    public CustomerModel(){

    }
    public CustomerModel(int id,String email,String numberPhone){
        this.id = id;
        this.email = email;
        this.numberPhone = numberPhone;
    }
    public CustomerModel(int id, String name, String email, String address, String numberPhone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.numberPhone = numberPhone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }
}
