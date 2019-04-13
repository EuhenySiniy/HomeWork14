package patterns.adapter;

public class AdapterForMercedes extends Mercedes implements Car {
    @Override
    public void startEngine() {
        mercedesStartEngine();
    }
}
