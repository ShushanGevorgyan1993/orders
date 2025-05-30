package am.order;

import am.order.models.Customer;
import am.order.models.ExpressOrder;
import am.order.models.InternationalOrder;
import am.order.models.Order;

public class Main {
    public static void main(String[] args) {
        Order order = new ExpressOrder("Mary Smith", 2000);
        order.printSummery();

        Order order1 = new InternationalOrder("John John", 1500);
        order1.printSummery();

        Order order2 = new ExpressOrder (new Customer("Henry", "Cooper",
                7734237,  "New York"));
        order2.newPrintSummery();

        //TODO  - verevi toxy chi ashxatel


        Order order3 = new InternationalOrder(new Customer("Charlotte", "Reed",
                6353234, "Paris"));


    }
}