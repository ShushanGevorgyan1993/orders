package am.order.ananimouus_inner_class;

public abstract class Animal {
    private String name;

    public abstract void move();

    public abstract void eat();

    public void setName(String name) {
        this.name = name;
    }

    public void drink() {
        System.out.println("Drinking...");
    }

    public String getName() {
        return name;
    }
}
