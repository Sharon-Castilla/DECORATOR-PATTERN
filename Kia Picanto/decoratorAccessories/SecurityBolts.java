package decoratorAccessories;

import car.Car;

public class SecurityBolts extends DecoratorAccessories {
    Car car;

    public SecurityBolts(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + ", Security bolts";
    }

    public double cost() {
        return 156100 + car.cost();
    }
}
