package patterns.abstractfactory;

public interface ProjectTeamFactory {
    Architect getArchitect();
    Foreman getForeman();
    Builder getBuilder();
}
