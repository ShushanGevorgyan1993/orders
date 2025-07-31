package am.order.data_analyzer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Data_Analyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> allNumbers = new ArrayList<>();
        int evenNumbersCount = 0;
        int divisibleByThreeCount = 0;

        System.out.println("Please insert numbers separated by spaces");
        String numbers = scanner.nextLine();

        for (String s : numbers.split(" ")) {
            int number = Integer.parseInt(s);
            allNumbers.add(number);
        }

        for (Integer number : allNumbers) {
            if (number % 2 == 0) {
                evenNumbersCount++;
            }
            if (number % 3 == 0) {
                divisibleByThreeCount++;
            }
        }

        int oddNumbersCount = allNumbers.size() - evenNumbersCount;

        System.out.println("The number of even numbers is " + evenNumbersCount);
        System.out.println("The number of odd numbers is " + oddNumbersCount);
        System.out.println("The numbers which can divided by three is " + divisibleByThreeCount);

        Collections.sort(allNumbers);
        System.out.println("The numbers are sorted in ascending order " + allNumbers);
        allNumbers.sort(Collections.reverseOrder());
        System.out.println("The numbers are sorted in reversed order " + allNumbers);
    }
}
