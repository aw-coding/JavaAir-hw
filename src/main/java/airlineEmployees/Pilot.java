package airlineEmployees;


public class Pilot extends Crew {

    private int licenceNumber;

    public Pilot(String name, Rank rank, int licenceNumber){
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }


    public int getLicenceNumber() {
        return this.licenceNumber;
    }
}
