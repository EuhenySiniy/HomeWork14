package patterns.factory;

public class FruitGarden {

    public static Fruit getFruitGarden(TreeTypes type) {
        Fruit toReturn = null;
        switch (type) {
            case KIWI:
                toReturn = new KiwiTree();
                break;
            case APPLE:
                toReturn = new AppleTree();
                break;
            case CHERRY:
                toReturn = new CherryTree();
                break;
            default:
                throw new IllegalArgumentException("Wrong fruit type " + type);
        }
        return toReturn;
    }
}
