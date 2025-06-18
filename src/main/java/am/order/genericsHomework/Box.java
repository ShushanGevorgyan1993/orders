package am.order.genericsHomework;

public class Box<T> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Box() {

    }

    public Box(T item) {
        this.item = item;
    }
}
