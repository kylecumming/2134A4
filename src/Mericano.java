public class Mericano extends Plant {

    public Mericano(int plantJolts, int plantGrowth) {
        super(plantJolts, plantGrowth);
    }

    public boolean canBeHarvested(){
        if(plantGrowth<=0){
            return false;
        }
        else{
            plantGrowth--;
            return true;
        }
    }
}
