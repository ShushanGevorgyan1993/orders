package am.order.login.models;

import am.order.login.models.exceptions.UserInvalidException;

public class User {
    private static int counter = 0;
    private int id;
    private String name;
    private int age;
    private String username;
    private String password;


    public User() {
        id = counter + 1;
        counter++;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String name, int age, String username, String password) {
        this.name = name;
        this.age = age;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) throws UserInvalidException {
        if (username.length() < 6) {
            throw new UserInvalidException("Your username should contain at least 6 symbols");
        }
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}



