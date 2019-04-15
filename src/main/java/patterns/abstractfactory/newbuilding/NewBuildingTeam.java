package patterns.abstractfactory.newbuilding;

import patterns.abstractfactory.Architect;
import patterns.abstractfactory.Builder;
import patterns.abstractfactory.Foreman;
import patterns.abstractfactory.ProjectTeamFactory;

public class NewBuildingTeam implements ProjectTeamFactory {
    @Override
    public Architect getArchitect() {
        return new NewBuildingArchitect();
    }

    @Override
    public Foreman getForeman() {
        return new NewBuildingForeman();
    }

    @Override
    public Builder getBuilder() {
        return new NewBuildingBuilder();
    }
}
