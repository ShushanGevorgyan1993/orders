package am.order.models;

public class InternationalOrder extends Order implements Deliverable {

    private static String vender = "Globbing";


    public InternationalOrder(Customer customer, double price) {
            super(customer, price);
        }

        @Override
        public double calculateDeliveryPrice() {
            return price * 0.2;
        }

    public static String getVender() {
        return vender;
    }

    public static void setVender(String vender) {
        InternationalOrder.vender = vender;
    }


    }


