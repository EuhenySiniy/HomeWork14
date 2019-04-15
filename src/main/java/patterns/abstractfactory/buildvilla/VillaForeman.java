package patterns.abstractfactory.buildvilla;

import patterns.abstractfactory.Foreman;

public class VillaForeman implements Foreman {
    @Override
    public void supervisesTheConstruction() {
        System.out.println("Supervises the builders..");
    }
}
