package am.order.Threads;

public class MyCustomThread extends Thread {

    private String name;

    public MyCustomThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Print this run " + name);
        }
    }
}
