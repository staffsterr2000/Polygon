package abstractFactoryPolygon.factories;

import abstractFactoryPolygon.CarName;

public class FactoryController {
    public static AbstractCarFactory getFactory(CarName name) {
        switch (name) {
            case HONDA:
                return new HondaFactory();
            case LADA:
                return new LadaFactory();
            case NISSAN:
                return new NissanFactory();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
