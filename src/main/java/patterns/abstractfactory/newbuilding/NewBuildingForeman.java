package patterns.abstractfactory.newbuilding;

import patterns.abstractfactory.Foreman;

public class NewBuildingForeman implements Foreman {
    @Override
    public void supervisesTheConstruction() {
        System.out.println("Supervises a builders..");
    }
}
