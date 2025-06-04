package am.order;

import am.order.models.*;

import java.util.ArrayList;
import am.order.models.Exceptions.CountryNotSupportedException;

public class Main {
    public static void main(String[] args) {


        Address address = new Address("United Kingdom", "London", "Oxford Street", "134");

        Address address1 = new Address("Armenia", "Yerevan", "Komitas 26", "12");

        Address address2 = new Address("Armenia", "Gyumri", "Shahumyan", "26");

        Address address3 = new Address("China", "Pekin", "Pekin", "554");


        Customer customer = new Customer("John", "Smith", "john@gmail.com", "+37477777777", address);

        Customer customer1 = new Customer("Ani", "Sargsyan", "anisargsyan@gmail.com", "+374577564389", address1);

        Customer customer2 = new Customer("Aram", "Gevorgyan", "aramgevorgyan@gmail.com", "+37493030303", address2);

        Customer customer3 = new Customer("Li", "Zhang", "Zhang@gmail.com", "2922365364", address3);


        ArrayList<Order> orders = new ArrayList<>();

        // Create orders with exception handling
        createOrder(orders, customer, 1500);
        createOrder(orders, customer1, 1200);
        createOrder(orders, customer2, 2000);
        createOrder(orders, customer3, 5000);

        System.out.println(ExpressOrder.getVendor());

        // Print summaries
        for (Order order : orders) {
            order.getCustomer().printSummary();
            order.printSummery();
            order.getCustomer().getAddress().printFullAddress();
            System.out.println("-------------------");
        }

        // Count orders
        int expressOrderCount = 0;
        int internationalOrderCount = 0;

        for (Order order : orders) {
            if (order instanceof ExpressOrder) {
                expressOrderCount++;
            } else if (order instanceof InternationalOrder) {
                internationalOrderCount++;
            }
        }

        System.out.println("Total orders: " + orders.size());
        System.out.println("Total Express orders: " + expressOrderCount);
        System.out.println("Total International orders: " + internationalOrderCount);
    }

    private static void createOrder(ArrayList<Order> orders, Customer customer, double price) {
        try {
            Order order = Order.createOrder(customer, price);
            orders.add(order);
        } catch (CountryNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }
}