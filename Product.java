package connecttosql;

public class Product {
    private String ID;
    private String name;
    private String price;
    private String number;
    private String describe;

    // Constructor mặc định
    public Product() {
    }

    // Constructor đầy đủ
    public Product(String ID, String name, String price, String number, String describe) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.number = number;
        this.describe = describe;
    }

  

    // Getter và Setter cho các thuộc tính
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String toString() {
        return "ID: " + ID + ", Name: " + name + ", Price: " + price + ", Quantity: " + number + ", Description: " + describe;
    }
}
