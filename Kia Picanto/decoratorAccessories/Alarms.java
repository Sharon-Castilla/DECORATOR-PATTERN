package decoratorAccessories;

import car.Car;

public class Alarms extends DecoratorAccessories {
    Car car;

    public Alarms(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + ", Alarms";
    }

    public double cost() {
        return 205000 + car.cost();
    }
}
