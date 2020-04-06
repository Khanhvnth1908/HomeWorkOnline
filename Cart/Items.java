package Ebookstore.Cart;

public class Items {
    private int id;
    private int product_id;
    private int qty;
    private double price;
    private double discount;

    public Items() {
    }

    public Items(int id, int product_id, int qty,double price) {
        this.id = id;
        this.product_id = product_id;
        this.qty = qty;
        this.price = price;
    }

    public Items(int id, int product_id, int qty, double price, double discount) {
        this.id = id;
        this.product_id = product_id;
        this.qty = qty;
        this.price = price;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", product_id=" + product_id +
                ", qty=" + qty +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}
