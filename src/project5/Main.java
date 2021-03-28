package project5;

public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<>("string");
        System.out.println(box);
        box.set("string");
        System.out.println(box);
    }
}
