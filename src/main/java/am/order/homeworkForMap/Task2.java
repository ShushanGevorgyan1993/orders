package am.order.homeworkForMap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("phoneBook.txt", true);
        BufferedWriter saveContact = new BufferedWriter(writer);

        PhoneBook contact = new PhoneBook();

        System.out.println(contact);

        boolean isAlive = true;

        Scanner scanner = new Scanner(System.in);

        while (isAlive) {
            System.out.println("Type 1 for add contact");
            System.out.println("Type 2 for delete contact");
            System.out.println("Type 3 for search contact");
            System.out.println("Type any other for for exit");

            switch (scanner.next()) {
                case "1":
                    System.out.println("Type name");
                    String name = scanner.next();
                    System.out.println("Type number");
                    String number = scanner.next();
                    contact.addContact(name, number);
                    saveContact.write(name + ": " + number);
                    saveContact.newLine();
                    saveContact.flush();
                    System.out.println("contact added");
                    break;
                case "2":
                    System.out.println("Type name for delete");
                    contact.deleteContact(scanner.next());
                    break;
                case "3":
                    System.out.println("Type name for search");
                    contact.searchContact(scanner.next());
                    break;
                default:
                    isAlive = false;
                    System.out.println("goodbye");
                    break;
            }
        }

        saveContact.close();
    }
}


