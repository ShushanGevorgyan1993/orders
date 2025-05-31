package am.order;

import am.order.models.Customer;
import am.order.models.ExpressOrder;
import am.order.models.InternationalOrder;
import am.order.models.Order;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("John",
                "Smith",
                "john@gmail.com",
                "+37477777777",
                "5 Azatutyun, Yerevan, Armenia");

        Customer customer1 = new Customer("Ani",
                "Sargsyan",
                "anisargsyan@gmail.com",
                "+374577564389",
                "16 Halabyan, Yerevan, Armenia");

        Customer customer2 = new Customer("Aram",
                "Gevorgyan",
                "aramgevorgyan@gmail.com",
                "+37493030303",
                "15 Papazyan, Yerevan, Armenia");


        Order order1 = new ExpressOrder(customer, 1500);
        Order order2 = new InternationalOrder(customer1, 1200);
        Order order3 = new ExpressOrder(customer2, 2000);

        Order[] orders = new Order[]{order1, order2, order3};

        for (Order order : orders) {
            order.getCustomer().printSummary();
            order.printSummery();
        }

        int totalOrders = orders.length;
        int expressOrdecCount = 0;
        int interOrderCount = 0;

        for (Order order : orders) {
            if (order instanceof ExpressOrder) {
                expressOrdecCount++;
                break;
            } else if (order instanceof InternationalOrder) {
                interOrderCount++;
            }
        }

        System.out.println("Total orders " + totalOrders);
        System.out.println("Total Express orders " + expressOrdecCount);
        System.out.println("Total International orders " + interOrderCount);


    }
}
