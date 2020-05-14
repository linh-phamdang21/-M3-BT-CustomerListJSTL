package model;

public class Customer {
    private String name;
    private String DOB;
    private String address;

    public Customer(){

    }

    public Customer(String name, String DOB, String address){
        this.name = name;
        this.DOB = DOB;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
