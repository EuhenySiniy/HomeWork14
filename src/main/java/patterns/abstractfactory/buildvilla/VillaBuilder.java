package patterns.abstractfactory.buildvilla;

import patterns.abstractfactory.Builder;

public class VillaBuilder implements Builder {
    @Override
    public void building() {
        System.out.println("Build a villa..");
    }
}
