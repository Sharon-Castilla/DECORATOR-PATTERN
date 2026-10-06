package decoratorAccessories;

import car.Car;

public class Rin14Black extends DecoratorAccessories {
    Car car;

    public Rin14Black(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + ", 14in black machined rims";
    }

    public double cost() {
        return 500000 + car.cost();
    }
}
