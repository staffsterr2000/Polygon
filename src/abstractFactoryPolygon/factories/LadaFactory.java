package abstractFactoryPolygon.factories;

import abstractFactoryPolygon.cars.SportCar;
import abstractFactoryPolygon.cars.Truck;
import abstractFactoryPolygon.cars.lada.LadaSportCar;
import abstractFactoryPolygon.cars.lada.LadaTruck;

public class LadaFactory extends AbstractCarFactory {
//    static final CarName CAR_NAME = CarName.LADA;

    @Override
    public SportCar getSportCar(String model) {
        return new LadaSportCar(model);
    }

    @Override
    public Truck getTruck(String model) {
        return new LadaTruck(model);
    }
}
