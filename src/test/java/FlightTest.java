import airlineEmployees.FlightAttendant;
import airlineEmployees.Pilot;
import airlineOperations.Flight;
import airlineOperations.Plane;
import airlineOperations.planeType;
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
    Plane plane;
    String flightNumber = "JA1001";
    String departureAirport = "EDI";
    String arrivalAirport = "LAX";
    int departureTime = 0745;



    @Before
    public void before(){
        plane = new Plane(planeType.CESSNA152);
        passenger1 = new Passenger("John Java", 2);
        passenger2 = new Passenger("Celia Ceeplusplus", 1);

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
    public void canGetFlightNumber(){
        assertEquals("JA1001", flight.getFlightNumber());
    }

    @Test
    public void canGetDepartureAirport(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void canGetArrivalAirport(){
        assertEquals("LAX", flight.getArrivalAirport());
    }

    @Test
    public void canGetDepartureTime(){
        assertEquals(0745, flight.getDepartureTime());
    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger1);
        assertEquals(1, flight.getNumberOfPassengers());
    }

    @Test
    public void cannotOverBookFlight(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(4, flight.getNumberOfPassengers());
    }

    @Test
    public void passengersCanDisembark(){
        flight.bookPassenger(passenger1);
        flight.passengersDisembark();
        assertEquals(0, flight.getNumberOfPassengers());
    }



    @Test
    public void canGetTotalWeightAvailableForBaggage(){
        assertEquals(37.5, flight.getRemainingWeightForLuggagePerPassenger(), 0.0);
    }

    @Test
    public void canGetTotalWeightOfLuggage(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(75.0, flight.getLuggageWeightReservedForBookedPassengers(), 0.0);
    }

    @Test
    public void canGetWeightRemainingForLuggage(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(75.0, flight.getWeightRemainingForLuggage(), 0);
    }

}
