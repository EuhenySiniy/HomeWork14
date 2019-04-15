package patterns.abstractfactory.newbuilding;

import patterns.abstractfactory.Architect;

public class NewBuildingArchitect implements Architect {
    @Override
    public void drawingCreation() {
        System.out.println("Create a drawing of new building..");
    }
}
