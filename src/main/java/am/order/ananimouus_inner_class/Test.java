package am.order.ananimouus_inner_class;

public class Test {
    public static void main(String[] args) {
        Animal fish = new Animal() {
            @Override
            public void move() {
                System.out.println("Swimming");
            }

            @Override
            public void eat() {
                System.out.println("Eating");

                }
            @Override
            public void drink() {
                System.out.println("Drinking water");
            }
        };

        fish.eat();
        fish.move();
        fish.drink();
        fish.setName("Captain");
        System.out.println( "The name of the fish is " + fish.getName());
    }
}
