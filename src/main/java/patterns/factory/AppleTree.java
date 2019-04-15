package patterns.factory;

public class AppleTree implements Fruit {
    @Override
    public void toPlant() {
        System.out.println("You planted a apple tree!");
    }
}
