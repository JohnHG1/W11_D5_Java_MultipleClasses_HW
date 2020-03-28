public enum PlaneType {

    BOEING747("BA268", 100, 150, 190.80),
    AIRBUS300("BA377", 80, 120, 140.50);

    private final String flightNumber;
    private final int capacity;
    private final int maxNoOfBags;
    private final double ticketCost;


    PlaneType(String flightNumber, int capacity, int maxNoOfBags, double ticketCost){
        this.flightNumber = flightNumber;
        this.capacity = capacity;
        this.maxNoOfBags = maxNoOfBags;
        this.ticketCost = ticketCost;
    }


}
