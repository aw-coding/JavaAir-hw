import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Paul Jackson", 2);

    }

    @Test
    public void hasName(){
        assertEquals("Paul Jackson", passenger.getName());
    }

    @Test
    public void hasNumberofBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }

}
