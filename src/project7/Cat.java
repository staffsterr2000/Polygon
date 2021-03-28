package project7;

public class Cat {
    private String name;
    private Cat catProxy;

    public void print() {
        System.out.println("cat " + name);
    }
    public void createProxy() {
        catProxy = new Cat(this.name) {
            private final String iname;
            {
                iname = name;
            }
            @Override
            public void print() {
                System.out.println("proxy cat " + iname);
            }
        };
    }


    public Cat(String name) {
        this.name = name;
    }
    public Cat() {

    }

    public static void main(String[] args) {
        Cat cat = new Cat("barsik");
        cat.print();

        cat.createProxy();
        Cat catProxy = cat.catProxy;

        catProxy.print();

        catProxy.createProxy();
        Cat catProxyProxy = catProxy.catProxy;
        catProxyProxy.print();
    }
}
