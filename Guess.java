package connecttosql;



public class Guess {
    private String ID;
    private String name;
    private String gender;
   
    private String phone;
    private String email;
    private String address;

    // Constructor không tham số
    public Guess() {}

    // Constructor với đầy đủ tham số
    public Guess(String ID, String name, String gender, String phone, String email, String address) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
  
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    // Getter và Setter cho ID
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    // Getter và Setter cho Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter và Setter cho Gender
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    // Getter và Setter cho Phone
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Getter và Setter cho Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter và Setter cho Address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

 
   
}
