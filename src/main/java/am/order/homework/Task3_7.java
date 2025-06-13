package am.order.homework;

import java.util.ArrayList;
import java.util.Arrays;


public class Task3_7 {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Mari", 22);
        Customer customer2 = new Customer("Davit", 47);
        Customer customer3 = new Customer("Kima", 28);
        Customer customer4 = new Customer("Elen", 33);
        Customer customer5 = new Customer("Karen", 19);

        ArrayList<Customer> customers = new ArrayList<>(Arrays.asList(customer1, customer2, customer3, customer4, customer5));

        //Խնդիր 3. Գտնել հաճախորդների ցանկի միջին տարիքը

        int ageOfCustomers = 0;
        for (Customer customer : customers) {
            ageOfCustomers = ageOfCustomers + customer.getAge();
        }
        double averageAgeOfCustomers = (double) ageOfCustomers / customers.size();
        System.out.println(averageAgeOfCustomers);

        System.out.println(("----------------------------------------"));

        //Խնդիր 7. Վերադարձնել այն հաճախորդների ցուցակը, որոնց անունը սկսվում է “K”-ով

        boolean isFound = false;
        for (Customer customer : customers) {
            if (customer.getName().startsWith("K")) {
                System.out.println("The name is " + customer.getName());
                isFound = true;
            }
        }
        if (isFound == false) {
            System.out.println("There are no customers with name starting K");
        }
    }
}



