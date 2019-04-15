package patterns.abstractfactory;

import patterns.abstractfactory.buildvilla.VillaTeam;

public class VillaForNewCustomer {
    public static void main(String[] args) {
        ProjectTeamFactory teamFactory = new VillaTeam();
        Architect architect = teamFactory.getArchitect();
        Foreman foreman = teamFactory.getForeman();
        Builder builder = teamFactory.getBuilder();

        architect.drawingCreation();
        foreman.supervisesTheConstruction();
        builder.building();
    }
}
