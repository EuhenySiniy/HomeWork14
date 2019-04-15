package patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    private static final Map<String, Car> cars = new HashMap<String, Car>();
    private static final String VOLVO = "volvo";
    private static final String RENAULT = "renault";

    public Car getCarByName(String brand) {
        Car car = cars.get(brand);

        if (car == null) {
            switch (brand) {
                case VOLVO:
                    System.out.println("took the keys to Volvo");
                    car = new Volvo();
                    break;
                case RENAULT:
                    System.out.println("took the keys to Renault");
                    car = new Renault();
                    break;
            }
            cars.put(brand, car);
        }
        return car;
    }
}
