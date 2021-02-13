package airlineOperations;

public class Plane {

    private planeType planeType;

    public Plane(planeType planeType){
        this.planeType = planeType;
    }

    public airlineOperations.planeType getPlaneType() {
        return this.planeType;
    }
}
