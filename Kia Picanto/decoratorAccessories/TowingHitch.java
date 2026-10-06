package decoratorAccessories;

import car.Car;

public class TowingHitch extends DecoratorAccessories {
    Car car;

    public TowingHitch(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + ", Towing hitch";
    }

    public double cost() {
        return 810000 + car.cost();
    }
}
