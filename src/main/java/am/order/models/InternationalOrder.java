package am.order.models;

public class InternationalOrder extends Order implements Deliverable {

    public InternationalOrder(String customerName, double price) {
        super(customerName, price);
    }

    public InternationalOrder(Customer customer) {
        super(customer);

    }

    @Override
    public double calculateDeliveryPrice() {
        return getPrice() * 0.2;
    }

    @Override
    public void printSummery() {
        super.printSummery();
        System.out.println("Type: International order. Delivery Price: $ " + calculateDeliveryPrice());
    }
}

