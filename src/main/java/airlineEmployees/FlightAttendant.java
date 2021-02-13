package airlineEmployees;

public class FlightAttendant extends Crew {

    public FlightAttendant(String name, Rank rank){
        super(name,rank);
    }

    public String relayMessage() {
        return "Please fasten your seatbelts.";
    }
}
