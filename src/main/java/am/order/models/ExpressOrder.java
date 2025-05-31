package am.order.models;


public class ExpressOrder extends Order implements Deliverable {

    private static String vender = "DHL";

    public ExpressOrder(Customer customer, double price) {
        super(customer, price);
    }
    @Override
    public double calculateDeliveryPrice() {
        return price * 0.1;
    }

    @Override
    public void printSummery() {
        super.printSummery();
        System.out.println("Type: Express Order. Delivery Price: AMD" + calculateDeliveryPrice());
    }

    public static String getVender() {
        return vender;
    }

    public static void setVender(String vender) {
        ExpressOrder.vender = vender;
    }

}


