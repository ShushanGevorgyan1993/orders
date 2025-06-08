package am.order.models.classwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task3 {
    public static void main(String[] args) {

        //set to UpperCase
        ArrayList<String> names = new ArrayList<>(Arrays.asList("suren", "anna", "ani", "narek", "marianna"));
        for (int i = 0; i < names.size(); i++) {
            String b = names.get(i).toUpperCase();
            names.set(i, b);
        }
        System.out.println(names);

        System.out.println("--------------------------------------------");


        //print with ordered structure and reversed

        Collections.sort(names);
        System.out.println(names);
        Collections.reverse(names);
        System.out.println(names);

        System.out.println("-----------------------");

        //find the longest name

        String maxLetterCount = "";
        for (String i : names) {
            if (i.length() > maxLetterCount.length()) {
                maxLetterCount = i;
            }
        }
        System.out.println(maxLetterCount);
    }
}
