package decoratorAccessories;

import car.Car;

public class Button extends DecoratorAccessories {
    Car car;

    public Button(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + ", Start button kit";
    }

    public double cost() {
        return 1500000 + car.cost();
    }
}
