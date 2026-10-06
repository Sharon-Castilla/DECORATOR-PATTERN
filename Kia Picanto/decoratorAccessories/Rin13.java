package decoratorAccessories;

import car.Car;

public class Rin13 extends DecoratorAccessories {
    Car car;

    public Rin13(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + ", 13in aluminum rims";
    }

    public double cost() {
        return 350000 + car.cost();
    }
}
