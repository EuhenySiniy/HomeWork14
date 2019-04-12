package patterns.adapter;

public class AdapterForMercedes extends Mercedes implements Car {
    public void startEngine() {
        mercedesStartEngine();
    }
}
