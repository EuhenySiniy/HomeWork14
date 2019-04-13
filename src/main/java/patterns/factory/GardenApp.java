package patterns.factory;

public class GardenApp {
    public static void main(String[] args) {
        FruitGarden fruitGarden = new FruitGarden();

        Fruit kiwi = fruitGarden.getFruitGarden(TreeTypes.KIWI);

        kiwi.toPlant();
    }
}
