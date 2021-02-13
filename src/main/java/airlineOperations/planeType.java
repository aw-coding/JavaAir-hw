package airlineOperations;

public enum planeType {

    CESSNA152(4, 300),
    VIKINGDHC6(19, 4500);

    private final int passengerCapacity;
    private final int weightLimit;

    planeType (int passengerCapacity, int weightLimit){
        this.passengerCapacity = passengerCapacity;
        this.weightLimit = weightLimit;
    }

    public int getPassengerCapacity(){
        return this.passengerCapacity;
    }

    public int getWeightLimit(){
        return this.weightLimit;
    }

}
