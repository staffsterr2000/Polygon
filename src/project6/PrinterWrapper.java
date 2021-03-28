package project6;

public class PrinterWrapper implements IPrinter {
    private IPrinter obj;

    @Override
    public void print() {
        printStars();
        obj.print();
//        printStars();
    }

    private void printStars() {
        System.out.println("*****************************");
    }

    public PrinterWrapper(IPrinter obj) {
        this.obj = obj;
    }
}
