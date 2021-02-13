import airlineEmployees.FlightAttendant;
import airlineEmployees.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightAttendantTest {

    FlightAttendant flightAttendant;

    @Before
    public void before(){
        flightAttendant = new FlightAttendant("Phil Seetz", Rank.LEVELONEFLIGHTATTENDANT);
    }

    @Test
    public void hasName(){
        assertEquals("Phil Seetz", flightAttendant.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.LEVELONEFLIGHTATTENDANT, flightAttendant.getRank());
    }
}
