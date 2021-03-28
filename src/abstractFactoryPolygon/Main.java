package abstractFactoryPolygon;

import abstractFactoryPolygon.cars.AbstractCar;
import abstractFactoryPolygon.factories.AbstractCarFactory;
import abstractFactoryPolygon.factories.FactoryController;

public class Main {
    public static void main(String[] args) {
        AbstractCarFactory factory = FactoryController.getFactory(CarName.HONDA);
        AbstractCar car = factory.getSportCar("ss234");
        car.move();

        System.out.println("-------------------------------");

        factory = FactoryController.getFactory(CarName.LADA);
        car = factory.getTruck("fura");
        car.move();

        System.out.println("-------------------------------");

        factory = FactoryController.getFactory(CarName.NISSAN);
        car = factory.getSportCar("nissan_sportCar");
        car.move();

        car = factory.getTruck("nissan_truck");
        car.move();

        System.out.println("-------------------------------");

        factory = FactoryController.getFactory(CarName.BENTLEY);
        car = factory.getTruck("bb");
        car.move();
    }
}
