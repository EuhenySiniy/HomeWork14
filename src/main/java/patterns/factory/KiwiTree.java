package patterns.factory;

public class KiwiTree implements Fruit {
    @Override
    public void toPlant() {
        System.out.println("You planted a kiwi tree!");
    }
}
