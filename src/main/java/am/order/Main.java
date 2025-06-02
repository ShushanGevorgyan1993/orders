package am.order;

import am.order.models.*;
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


        Order order3 = null;
        Order  order4 = null;

        Order order1 = new ExpressOrder(customer, 1500);
        Order order2 = new ExpressOrder(customer1, 2000);


        try {
            order3 = new InternationalOrder(customer2, 3400);
        } catch (CountryNotSupportedException e) {
            System.out.println("Error creating order3: " + e.getMessage());
        }

        try {
            order4 = new InternationalOrder(customer3, 5000);
        } catch (CountryNotSupportedException e) {
            System.out.println("Error creating order4: " + e.getMessage());
        }


        System.out.println(ExpressOrder.getVendor());


        Order[] orders = new Order[]{order1, order2, order3, order4};

        for (Order order : orders) {
            order.getCustomer().printSummary();
            order.printSummery();
            order.getCustomer().getAddress().printFullAddress();
            System.out.println("-------------------");
        }

        int totalOrders = orders.length;
        int expressOrdercCount = 0;
        int interOrderCount = 0;

        for (Order order : orders) {
            if (order instanceof ExpressOrder) {
                expressOrdercCount++;
                break;
            } else if (order instanceof InternationalOrder) {
                interOrderCount++;
            }
        }

        System.out.println("Total orders " + totalOrders);
        System.out.println("Total Express orders " + expressOrdercCount);
        System.out.println("Total International orders " + interOrderCount);
    }
}

