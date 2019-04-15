package patterns.factory.builder;

public class BuildApp {
    public static void main(String[] args) {
        Plants plants = new Plants.PlantsBuilder()
                .setCountHectar(10)
                .setName("Ahro-Victorya")
                .build();
    }
}
