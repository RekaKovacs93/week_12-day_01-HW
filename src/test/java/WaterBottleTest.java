
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    Waterbottle waterbottle;

    @Before
    public void before(){
        waterbottle = new Waterbottle(100);
    }

    @Test
    public void canDrink(){
        assertEquals(90, waterbottle.drink());
    }

    @Test
    public void canEmpty(){
        assertEquals(0, waterbottle.emptyWater());
    }

    @Test
    public void canFill(){
        assertEquals(100, waterbottle.fillWater());
    }

}
