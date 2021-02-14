import airlineEmployees.FlightAttendant;
import airlineEmployees.Pilot;
import airlineOperations.Flight;
import airlineOperations.Plane;
import customers.Passenger;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    ArrayList<Pilot> pilots;
    Pilot pilot1;
    Pilot pilot2;
    ArrayList<FlightAttendant> cabinCrew;
    FlightAttendant flightAttendant1;
    FlightAttendant flightAttendant2;
    FlightAttendant flightAttendant3;
    ArrayList<Passenger> passengers;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Plane plane;
    String flightNumber = "JA1001";
    String departureAirport = "EDI";
    String arrivalAirport = "LAX";
    int departureTime = 0745;



    @Before
    public void before(){

        flight = new Flight(pilots, cabinCrew, passengers, plane, flightNumber,
                departureAirport, arrivalAirport, departureTime);
    }

    @Test
    public void canAddPilot(){
        flight.addPilot(pilot1);
        assertEquals(1, flight.getNumberOfPilots());
    }

    @Test
    public void canAddFlightAttendant(){
        flight.addFlightAttendant(flightAttendant1);
        assertEquals(1, flight.getNumberOfFlightAttendants());
    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.getNumberOfPassengers());
    }

//    @Test
//    public void canGetFlightNumber(){
//        assertEquals("JA1001", flight.getFlightNumber());
//    }

}
