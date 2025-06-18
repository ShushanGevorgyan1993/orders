package am.order.genericsHomework;

import am.order.models.Address;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Task 1:Create a class Box<T> that stores one item of any type.
        //Add setItem(T item) and T getItem() methods.

        Box<Address> customerBox = new Box<>();
        customerBox.setItem(new Address("Armenia", "Yerevan", "Komitas", "27"));
        System.out.println(customerBox.getItem());

        Box<Integer> integer = new Box<>(135);
        System.out.println(integer.getItem());

        //Task 2: Create a class Pair<K, V> that holds a key and a value. Add methods to get/set both.

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> products = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("What is the product item? ");
            String key = scanner.nextLine();
            System.out.println("How many " + key + " is left?");
            int value = Integer.parseInt(scanner.nextLine());

            Pair<String, Integer> pair = new Pair<>(key, value);
            pair.printInfo();
            products.put(key, value);
        }

        System.out.println();

        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            System.out.println(
                    entry.getKey().substring(0, 1).toUpperCase() +
                            entry.getKey().substring(1).toLowerCase() +
                            ": " + entry.getValue());
        }

        scanner.close();
    }
}