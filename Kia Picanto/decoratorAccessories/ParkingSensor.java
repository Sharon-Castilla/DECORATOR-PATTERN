package decoratorAccessories;

import car.Car;

public class ParkingSensor extends DecoratorAccessories {
    Car car;

    public ParkingSensor(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + ", Parking sensor";
    }

    public double cost() {
        return 150000 + car.cost();
    }
}
