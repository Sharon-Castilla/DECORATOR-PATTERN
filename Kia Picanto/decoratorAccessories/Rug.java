package decoratorAccessories;

import car.Car;

public class Rug extends DecoratorAccessories {
    Car car;

    public Rug(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + ", Rug";
    }

    public double cost() {
        return 92000 + car.cost();
    }
}
