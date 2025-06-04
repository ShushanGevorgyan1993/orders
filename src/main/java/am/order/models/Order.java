package am.order.models;

public class Order implements Comparable<Order> {
    protected Customer customer;
    protected double price;

    public Order(Customer customer) {
        this.customer = customer;
        this.price = 0;
    }

    public Order(Customer customer, double price) {
        this.customer = customer;
        this.price = price;
    }

    @Override
    public String toString() {
        return customer.getFirstName() + " " + customer.getLastName() + " " + price;
    }

    public static Order createOrder(Customer customer, double price) {
        String country = customer.getAddress().getCountry();

        if (country.equalsIgnoreCase("Armenia")) {
            return new ExpressOrder(customer, price);
        } else {
            return new InternationalOrder(customer, price);
        }
    }

    public void printSummery() {
        System.out.println("Order Price: AMD" + price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public int compareTo(Order order) {
        if (this.price < order.price) {
            return -1;
        } else if (this.price > order.price) {
            return 1;
        } else {
            return 0;
        }
    }
}

