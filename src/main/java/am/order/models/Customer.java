package am.order.models;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Address address;


    public Customer(String firstName,
                    String lastName,
                    String email,
                    String phone,
                    Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public void printSummary() {
        System.out.println("Customer: " + firstName + " "
                + lastName + " " + email + " "
                + phone);
    }

    public String toString(){
        return ("✅" + firstName + " " + lastName + " " + phone);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}


