package Ellie.musicapp.Controller.ex;

public class NameNumber {
    private String lastName;
    private String telNumber;

    // Constructor mặc định
    public NameNumber() {}

    // Constructor có tham số
    public NameNumber(String name, String num) {
        this.lastName = name;
        this.telNumber = num;
    }

    // Getter
    public String getLastName() {
        return lastName;
    }

    public String getTelNumber() {
        return telNumber;
    }

    // Setter
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    // toString để in thông tin dễ dàng
    @Override
    public String toString() {
        return "NameNumber{lastName='" + lastName + "', telNumber='" + telNumber + "'}";
    }
}
