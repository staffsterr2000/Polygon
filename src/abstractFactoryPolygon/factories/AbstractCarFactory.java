package abstractFactoryPolygon.factories;

import abstractFactoryPolygon.cars.SportCar;
import abstractFactoryPolygon.cars.Truck;

public abstract class AbstractCarFactory {
    public abstract SportCar getSportCar(String model);
    public abstract Truck getTruck(String model);
}
