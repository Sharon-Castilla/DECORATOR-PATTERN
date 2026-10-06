import car.Car;
import CarModel.*;
import decoratorAccessories.*;

public class App {

    static void show(Car car) {
        System.out.println(car.getDescription() + " $" + String.format("%,.0f", car.cost()));
    }

    public static void main(String[] args) {


        Car car = new VibrantMT();
        show(car);


        Car car2 = new ZenithMT();
        car2 = new Rug(car2);
        car2 = new Alarms(car2);
        show(car2);


        Car car3 = new GTLineAT();
        car3 = new Rin13(car3);
        car3 = new Button(car3);
        car3 = new SecurityBolts(car3);
        car3 = new CargoNet(car3);
        car3 = new TowingHitch(car3);
        car3 = new BicycleCarrier(car3);
        show(car3);


        Car car4 = new ZenithAT();
        car4 = new ParkingSensor(car4);
        car4 = new Rin14Black(car4);
        car4 = new Alarms(car4);
        show(car4);


        Car car5 = new VibrantMT();
        car5 = new Rin14Gray(car5);
        car5 = new Rin14Gray(car5);
        show(car5);
    }
}
