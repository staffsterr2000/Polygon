package abstractFactoryPolygon.cars;

public abstract class AbstractCar {
    protected String model;

    public AbstractCar(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }

    public abstract void move();
    public abstract void brake();
}
