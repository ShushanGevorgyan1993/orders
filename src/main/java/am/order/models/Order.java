package am.order.models;


public class Order {

    private String customerName;
    private double price;
    private Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public Order(String customerName) {
        this.customerName = customerName;
        this.price = 0;
    }

    public Order(String customerName, double price) {
        this.customerName = customerName;
        this.price = price;
    }


    public void newPrintSummery() {
        System.out.println("Customer: " + customer);
    }

    public void printSummery() {
        StringBuilder sb = new StringBuilder();
        String printSummery = sb.append("Customer: ")
                .append(customerName)
                .append(".")
                .append(" Price: $ ")
                .append(price).toString();
        System.out.println(printSummery);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}
