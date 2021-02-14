import airlineEmployees.Rank;
import airlineEmployees.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Francine Goose", Rank.FIRSTOFFICER, 85212);
    }



    @Test
    public void hasLicenceNumber(){
        assertEquals(85212, pilot.getLicenceNumber());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("Ready for takeoff.", pilot.fly());
    }

}
