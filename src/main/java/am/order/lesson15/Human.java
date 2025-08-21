package am.order.lesson15;

public class Human {
    private String name;
    private int age;

    {
        System.out.println("from init block");
    }

    static {
        System.out.println("from static block");
    }

    public Human() {
    }

    public Human(String name, int age) {
        System.out.println("from constructor");
        this.name = name;
        this.age = age;
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
}
