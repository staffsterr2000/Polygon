package project6;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer("string to print");
        printer.print();

        System.out.println();

        PrinterWrapper wrapper = new PrinterWrapper(new PrinterWrapper(printer));
        wrapper.print();
    }
}
