import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpressoTest {
    @Test
    void plantJolts(){
        Plant p = new Plant(4,2);
        assertTrue(p.plantJolts==4, "Does not return correct value");
        assertTrue(p.getPlantJolts()==4,"does not return expected value");
    }
    @Test
    void plantGrowth(){
        Plant p = new Plant(4,2);
        assertTrue(p.plantGrowth==2,"does not return expected value");
        assertTrue(p.getPlantGrowth()==2,"does not return expected value");
    }
}