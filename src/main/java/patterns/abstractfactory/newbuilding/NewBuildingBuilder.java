package patterns.abstractfactory.newbuilding;

import patterns.abstractfactory.Builder;

public class NewBuildingBuilder implements Builder {
    @Override
    public void building() {
        System.out.println("Build a new building..");
    }
}
