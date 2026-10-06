package decoratorAccessories;

import car.Car;

public class BicycleCarrier extends DecoratorAccessories {
    Car car;

    public BicycleCarrier(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + ", Bicycle carrier";
    }

    public double cost() {
        return 910000 + car.cost();
    }
}
