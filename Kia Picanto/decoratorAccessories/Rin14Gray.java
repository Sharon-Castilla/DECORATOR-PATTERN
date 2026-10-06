package decoratorAccessories;

import car.Car;

public class Rin14Gray extends DecoratorAccessories {
    Car car;

    public Rin14Gray(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + ", 14in gray machined rims";
    }

    public double cost() {
        return 500000 + car.cost();
    }
}
