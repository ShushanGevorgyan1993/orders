package am.order.models;


public class ExpressOrder extends Order implements Deliverable {

    public ExpressOrder(String customerName, double price) {
        super(customerName, price);
    }

    public ExpressOrder(Customer customer) {
        super(customer);
    }

    @Override
    public double calculateDeliveryPrice() {
        return getPrice() * 0.1;
    }

    @Override
    public void printSummery() {
        super.printSummery();
        System.out.println("Type: Express order. Delivery Price: $ " + calculateDeliveryPrice());
    }
}


