public class Plant {

    protected int plantJolts;
    protected int plantGrowth;


    public Plant(int plantJolts, int plantGrowth) {
        this.plantJolts = plantJolts;
        this.plantGrowth = plantGrowth;
    }

    public int getPlantJolts() {
        return plantJolts;
    }

    public void setPlantJolts(int plantJolts) {
        this.plantJolts = plantJolts;
    }

    public int getPlantGrowth() {
        return plantGrowth;
    }

    public void setPlantGrowth(int plantGrowth) {
        this.plantGrowth = plantGrowth;
    }
}
