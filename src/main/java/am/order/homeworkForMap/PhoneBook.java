package am.order.homeworkForMap;

import java.util.HashMap;

public class PhoneBook {

    HashMap<String, String> contact = new HashMap<>();

    public void addContact(String name, String phoneNumber) {
        contact.put(name, phoneNumber);
    }

    public void deleteContact(String name) {
        contact.remove(name);
    }

    public void searchContact(String name) {
        if (contact.containsKey(name)) {
            System.out.println(contact.get(name));
        } else {
            System.out.println("The contact does not exist");
        }
    }

}


