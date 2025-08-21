package am.order.lesson15;

public class Generics {
    public static <T> void print(T... elements) {
        for (T x : elements) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        print(1, 3, 56, 8);
        print("Anna", "Shushan", "Mariam");
        print(56.1, 9.8, 94.3, 5.8);
    }
}
