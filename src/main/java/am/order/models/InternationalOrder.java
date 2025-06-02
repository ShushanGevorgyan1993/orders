package am.order.models;

import am.order.models.Exceptions.CountryNotSupportedException;

public class InternationalOrder extends Order implements Deliverable {

    private static String vendor = "Globbing";


    public InternationalOrder(Customer customer, double price) {
            super(customer, price);
            String country = customer.getAddress().getCountry();
            if (country.equals("Georgia") || country.equals("China")) {
                throw new CountryNotSupportedException("Unfortunately, we can't ship to your country.");
            }
        }

        @Override
        public void printSummery() {
        super.printSummery();
            System.out.println("International order. Order price is " + calculateDeliveryPrice());
        }

        @Override
        public double calculateDeliveryPrice() {
            return price * 0.2;
        }

    public static String getVendor() {
        return vendor;
    }

    public static void setVendor(String vendor) {
        InternationalOrder.vendor = vendor;
    }


    }


