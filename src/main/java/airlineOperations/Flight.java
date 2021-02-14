package airlineOperations;

import airlineEmployees.FlightAttendant;
import airlineEmployees.Pilot;
import customers.Passenger;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<FlightAttendant> cabinCrew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String departureAirport;
    private String arrivalAirport;
    private int departureTime;

    public Flight(ArrayList<Pilot> pilots, ArrayList<FlightAttendant> cabinCrew,
                  ArrayList<Passenger> passengers, Plane plane, String flightNumber, String departureAirport,
                  String arrivalAirport, int departureTime){
        this.pilots = new ArrayList<Pilot>();
        this.cabinCrew = new ArrayList<FlightAttendant>();
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
    }

    public int getNumberOfPilots() {
        return pilots.size();
    }

    public void addPilot(Pilot pilot){
        pilots.add(pilot);
    }

    public void addFlightAttendant(FlightAttendant flightAttendant){
        cabinCrew.add(flightAttendant);
    }

    public int getNumberOfFlightAttendants(){
        return this.cabinCrew.size();
    }


    public int getNumberOfPassengers() {
        return this.passengers.size();
    }

    public String getFlightNumber(){
        return this.flightNumber;
    }

    public String getDepartureAirport(){
        return this.departureAirport;
    }

    public String getArrivalAirport(){
        return this.arrivalAirport;
    }

    public int getDepartureTime(){
        return this.departureTime;
    }

    public void bookPassenger(Passenger passenger){
        if (this.getNumberOfPassengers() < this.plane.getPassengerCapacity()) {
            this.passengers.add(passenger);
        }
    }

    public void passengersDisembark(){
        this.passengers.clear();
    }

    public int getTotalPassengerWeight(){
        return this.getNumberOfPassengers() * 70;
    }
}
