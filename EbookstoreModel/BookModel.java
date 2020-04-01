package Ebookstore.EbookstoreModel;


public class BookModel {
    private  int id;
    private String nameBook;
    private int qty;
    private double price;
    private String datetime;
    private int edition;
    private String bookCode;
    private String status;
    private int the_loai_id;
    private int authour_id;

    public BookModel(){

    }
    public BookModel(int id,int qty, double price){
        this.id = id;
        this.qty = qty;
        this.price = price;

    }
    public BookModel(int id, String nameBook, int qty, double price,int the_loai_id,int authour_id){
        this.id = id;
        this.nameBook = nameBook;
        this.qty = qty;
        this.price = price;
        this.the_loai_id = the_loai_id;
        this.authour_id = authour_id;
    }
    public BookModel(int id, String nameBook, int qty, double price, String datetime, int edition, String bookCode, String status, int the_loai_id,int authour_id) {
        this.id = id;
        this.nameBook = nameBook;
        this.qty = qty;
        this.price = price;
        this.datetime = datetime;
        this.edition = edition;
        this.bookCode = bookCode;
        this.status = status;
        this.the_loai_id = the_loai_id;
        this.authour_id = authour_id;
    }

    public int getAuthour_id() {
        return authour_id;
    }

    public void setAuthour_id(int authour_id) {
        this.authour_id = authour_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
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

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getThe_loai_id() {
        return the_loai_id;
    }

    public void setThe_loai_id(int the_loai_id) {
        this.the_loai_id = the_loai_id;
    }
}
