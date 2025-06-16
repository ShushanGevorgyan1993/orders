package am.order.sportsman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Sportsman sportsman1 = new Sportsman() {
            @Override
            public void play() {
                Scanner scanner = new Scanner(System.in);

                System.out.println("What is your sport name? ");
                String sportName = scanner.nextLine();
                System.out.println("Are you playing single or with your team?");
                String teamPlayerOrSinglePlayer = scanner.nextLine();

                SportCategory category = SportCategory.valueOf(teamPlayerOrSinglePlayer.toUpperCase());
                System.out.println("I'm playing " + sportName.toLowerCase() + category.getInfo());
            }
        };

        Sportsman sportsman2 = new Sportsman() {
            @Override
            public void play() {
                Scanner scanner = new Scanner(System.in);

                System.out.println("What is your sport name? ");
                String sportName = scanner.nextLine();
                System.out.println("Are you playing single or with your team? ");
                String teamPlayerOrSinglePlayer = scanner.nextLine();

                SportCategory category = SportCategory.valueOf(teamPlayerOrSinglePlayer.toUpperCase());
                System.out.println("I'm playing " + sportName.toLowerCase() + category.getInfo());

            }
        };

        Sportsman sportsman3 = new Sportsman() {
            @Override
            public void play() {
                Scanner scanner = new Scanner(System.in);

                System.out.println("What is your sport name? ");
                String sportName = scanner.nextLine();
                System.out.println("Are you playing single or with your team? ");
                String teamPlayerOrSinglePlayer = scanner.nextLine();

                SportCategory category = SportCategory.valueOf(teamPlayerOrSinglePlayer.toUpperCase());
                System.out.println("I'm playing " + sportName.toLowerCase() + category.getInfo());
                scanner.close();
            }
        };

        sportsman1.play();
        sportsman2.play();
        sportsman3.play();

    }
}
