package am.order.models.classwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Classwork {
    public static void main(String[] args) {

        //Create List and remove negatives

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(8, 9, 10, 6, -7, 2, -60, 4));
        numbers.removeIf(n -> n < 0);
        System.out.println(numbers);

        // Print maximum and minimum values from List
        //solution 1
        TreeSet<Integer> z = new TreeSet<>(Arrays.asList(8, 9, 10, 6, -7, 2, -60, 4, 98));
        System.out.println("The lowest number is " + z.first());
        System.out.println ("The biggest number is " + z.last());

        System.out.println("---------------------------");


        //solution 2
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(9, 9, 10, 6, -7, 2, -60, 4));
        System.out.println("The minimum numbet " + Collections.min(b));
        System.out.println("The maximum numbet " + Collections.max(b));
    }
}

