package am.order.models;

import java.util.Comparator;

public class NameComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
