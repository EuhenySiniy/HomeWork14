package patterns.abstractfactory.buildvilla;

import patterns.abstractfactory.Architect;
import patterns.abstractfactory.Builder;
import patterns.abstractfactory.Foreman;
import patterns.abstractfactory.ProjectTeamFactory;

public class VillaTeam implements ProjectTeamFactory {
    @Override
    public Architect getArchitect() {
        return new VillaArchitect();
    }

    @Override
    public Foreman getForeman() {
        return new VillaForeman();
    }

    @Override
    public Builder getBuilder() {
        return new VillaBuilder();
    }
}
