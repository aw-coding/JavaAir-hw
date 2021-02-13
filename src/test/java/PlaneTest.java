import airlineOperations.Plane;
import airlineOperations.planeType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    public Plane plane;

    @Before
    public void before(){
        plane = new Plane(planeType.CESSNA152);
    }

    @Test
    public void hasType() {
        assertEquals(planeType.CESSNA152, plane.getPlaneType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(4, plane.getPassengerCapacity());
    }

    @Test
    public void hasWeightLimit(){
        assertEquals(300, plane.getWeightLimit());
    }
}
