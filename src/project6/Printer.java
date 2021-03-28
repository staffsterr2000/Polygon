package project6;

public class Printer implements IPrinter {
    private final String message;

    public Printer(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public void print() {
        System.out.println(message);
    }
}
