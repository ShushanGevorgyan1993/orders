package am.order.models;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
