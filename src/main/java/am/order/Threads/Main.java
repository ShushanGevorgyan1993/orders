package am.order.Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyCustomThread thread1 = new MyCustomThread("Running first");
        MyCustomThread thread2 = new MyCustomThread("Running second");
        MyCustomThread thread3 = new MyCustomThread("Running third");

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        System.out.println("Custom run");

    }
}
