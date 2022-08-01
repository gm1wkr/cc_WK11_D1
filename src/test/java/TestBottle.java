import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBottle {

    Bottle bottle;

    @Before
    public void before(){
        bottle = new Bottle(100);
    }

    @Test
    public void volumeStartsAt100(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void volumeDecreasesByTenWhenDrunk(){
        bottle.drink();
        bottle.drink();
        assertEquals(80, bottle.getVolume());
    }

    @Test
    public void bottleCanBeEmptied(){
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void bottleCanBeFilled(){
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }

}
