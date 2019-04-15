package patterns.factory.builder;

import patterns.factory.Fruit;

public class Plants implements Fruit {
    public int hectar;
    public String nameOfGarden;

    public void setHectar(int hectar) {
        this.hectar = hectar;
    }

    public void setNameOfGarden(String nameOfGarden) {
        this.nameOfGarden = nameOfGarden;
    }

    @Override
    public void toPlant() {
        System.out.println("planting tree..");
    }

    public static class PlantsBuilder {
        private int countHectar;
        private String name;

        public PlantsBuilder setCountHectar (int countHectar) {
            this.countHectar = countHectar;
            return this;
        }

        public PlantsBuilder setName(String name) {
            this.name = name;
            return this;
        }

        Plants build() {
            Plants plants = new Plants();
            plants.setNameOfGarden(name);
            plants.setHectar(countHectar);
            return plants;
        }
    }
}
