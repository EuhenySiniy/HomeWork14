package patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    private static final Map<String, Car> cars = new HashMap<String, Car>();

    public Car getCarByName(String brand) {
        Car car = cars.get(brand);

        if (car == null) {
            switch (brand) {
                case "volvo":
                    System.out.println("took the keys to Volvo");
                    car = new Volvo();
                    break;
                case "renault":
                    System.out.println("took the keys to Renault");
                    car = new Renault();
                    break;
            }
            cars.put(brand, car);
        }
        return car;
    }
}
