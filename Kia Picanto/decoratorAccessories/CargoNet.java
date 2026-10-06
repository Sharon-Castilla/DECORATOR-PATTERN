package decoratorAccessories;

import car.Car;

public class CargoNet extends DecoratorAccessories {
    Car car;

    public CargoNet(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + ", Cargo net";
    }

    public double cost() {
        return 110000 + car.cost();
    }
}
