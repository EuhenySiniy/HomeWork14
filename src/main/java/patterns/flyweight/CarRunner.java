package patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class CarRunner {
    public static void main(String[] args) {
        Garage garage = new Garage();
        List<Car> cars = new ArrayList<>();

        cars.add(garage.getCarByName("volvo"));

        for (Car car : cars) {
            car.startEngine();
        }
    }
}
