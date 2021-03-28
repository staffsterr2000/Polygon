package abstractFactoryPolygon.cars;

public class Truck extends AbstractCar {
    public Truck(String model) {
        super(model);
    }

    @Override
    public void move() {
        System.out.println("truck " + model + " moves");
    }

    @Override
    public void brake() {
        System.out.println("truck " + model + " brakes");
    }
}
