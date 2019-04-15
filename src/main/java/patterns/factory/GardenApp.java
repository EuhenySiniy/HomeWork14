package patterns.factory;

public class GardenApp {
    public static void main(String[] args) {
        FruitGarden.getFruitGarden(TreeTypes.KIWI);
        FruitGarden.getFruitGarden(TreeTypes.CHERRY);
    }
}
