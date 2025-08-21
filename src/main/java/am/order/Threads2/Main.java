package am.order.Threads2;

public class Main {

    public static void main(String[] args) {


        MyCustomThread thread1 = new MyCustomThread("Thread one");
        MyCustomThread thread2 = new MyCustomThread("Thread two");

        thread1.start();
        thread2.start();
    }

    public synchronized static void counter(String name) {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Counter for " + name + " " + 1);
        }
    }
}
