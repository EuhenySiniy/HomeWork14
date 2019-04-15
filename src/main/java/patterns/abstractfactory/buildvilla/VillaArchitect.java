package patterns.abstractfactory.buildvilla;

import patterns.abstractfactory.Architect;

public class VillaArchitect implements Architect {
    @Override
    public void drawingCreation() {
        System.out.println("Create a drawing of villa..");
    }
}
