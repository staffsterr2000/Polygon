package abstractFactoryPolygon.factories;

import abstractFactoryPolygon.cars.SportCar;
import abstractFactoryPolygon.cars.Truck;
import abstractFactoryPolygon.cars.nissan.NissanSportCar;

public class NissanFactory extends AbstractCarFactory {
    @Override
    public SportCar getSportCar(String model) {
        return new NissanSportCar(model);
    }

    @Override
    public Truck getTruck(String model) {
        throw new UnsupportedOperationException("Nissan hasn't any trucks");
    }
}
