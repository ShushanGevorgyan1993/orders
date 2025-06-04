package am.order.models;

public class Address implements Comparable<Address> {
    private String country;
    private String city;
    private String street;
    private String apartment;


    public Address(String country, String city, String street, String apartment) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return country + " " + city;
    }

    @Override
    public int compareTo(Address o) {
        return this.getCity().compareTo(o.getCity());
    }

    public void printFullAddress() {
        System.out.println("The address is: " + country + ", " + city + ", " + street + ", " + apartment);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}
