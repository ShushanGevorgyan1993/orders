package am.order.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {

        //Խնդիր 1. Լիստի Բոլոր զույգ թվերի քառակուսիները վերադարձնել նոր ցուցակով

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(21, 4, 24, -5, -6, 8, 12, 2, 7));
        ArrayList<Integer> squares = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                squares.add(number * number);
            }
        }
        System.out.println(squares);
    }
}
