package abstractFactoryPolygon.factories;

import abstractFactoryPolygon.cars.SportCar;
import abstractFactoryPolygon.cars.Truck;
import abstractFactoryPolygon.cars.honda.HondaSportCar;
import abstractFactoryPolygon.cars.honda.HondaTruck;

public class HondaFactory extends AbstractCarFactory {
    @Override
    public SportCar getSportCar(String model) {
        return new HondaSportCar(model);
    }

    @Override
    public Truck getTruck(String model) {
        return new HondaTruck(model);
    }
}
