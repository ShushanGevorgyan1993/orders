package am.order.ExercisesByMyself;

import java.util.Scanner;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter several words by space");
        String sentence = scanner.nextLine();
        String[] words = sentence.toLowerCase().split(" ");


    }
}