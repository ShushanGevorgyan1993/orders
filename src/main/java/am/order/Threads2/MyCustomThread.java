package am.order.Threads2;

public class MyCustomThread extends Thread {

private String name;

    public MyCustomThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
      Main.counter(name);
    }
}
