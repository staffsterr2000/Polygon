package project5;

public class Box<T> {
    private T field;

    public Box(T field) {
        this.field = field;
    }

    public void set(T field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return field.toString();
    }
}
