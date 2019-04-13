package patterns.prototype;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car implements Copyable {
    private String brand;
    private String model;
    private int horsePower;


    @Override
    public Object copy() {
        return new Car(brand, model, horsePower);
    }
}
