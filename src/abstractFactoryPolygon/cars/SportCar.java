package abstractFactoryPolygon.cars;

public class SportCar extends AbstractCar {
    public SportCar(String model) {
        super(model);
    }

    @Override
    public void move() {
        System.out.println("sport car " + model + " moves");
    }

    @Override
    public void brake() {
        System.out.println("sport car " + model + " brakes");
    }
}
