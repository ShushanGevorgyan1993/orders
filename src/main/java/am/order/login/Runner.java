package am.order.login;

import am.order.login.models.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Runner {

    static List<User> users = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static User currentuser;
    static boolean isAlive = true;

    public static void main(String[] args) {

        System.out.println("Welcome to our world");

        while (isAlive) {
            System.out.println("Type 1 for reg");
            System.out.println("Type 2 for login");
            System.out.println("Type 3 for exit");

            String command = scanner.next();

            switch (command) {
                case "1":
                    register();
                case "2":
                    login();
                case "3":
                    isAlive = false;
                    break;
                default:
                    System.out.println("Invalid ");

            }
        }
    }

   // public static void handleLoggedOutState();

    public static void register() {
        User user = new User();
        System.out.println("Input username");
        user.setUsername(scanner.next());
        System.out.println("Input password");
        user.setPassword(scanner.next());
        users.add(user);
        System.out.println("You're registered");
    }

    public static void login() {
        System.out.println("Input username");
        String username = scanner.next();
        User user = users.stream().filter(u -> u.getUsername().equals(username)).findAny().orElse(null);
        if (user == null) {
            System.out.println("Invalid user");
            return;
        }
        System.out.println("Input password");
        String password = scanner.next();
        if (!user.getPassword().equals(password)) {
            System.out.println("Invalid password");
            return;
        }
        System.out.println("You are logged in");
        currentuser = user;
    }


}
