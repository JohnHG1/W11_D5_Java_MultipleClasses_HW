import java.util.ArrayList;

public class Plane {
    
    private final String flightnumber;
    private int capacity;
    private int maxNoOfBags;
    private double ticketCost;
    private ArrayList<Passenger> passengers;
    private Plane flightNumber;


    public Plane(String flightNumber, int capacity, int maxNoOfBags, double ticketCost){
        this.flightnumber = flightNumber;
        this.capacity = 0;
        this.maxNoOfBags = 0;
        this.ticketCost = ticketCost;
        this.passengers = new ArrayList<Passenger>();

    }

    public void addPassenger(Passenger passenger) {
        passenger.payMoney(this.flightNumber.getTicketCost());

        if(passenger.sufficientMoney(amount)){
            passenger.payMoney(amount);
            this.passengers.add(passenger);
        }
    }

    private int getTicketCost() {
        return this.plane.flightNumber.ticketCost;
    }

    public int capacity() {
        return this.flightNumber.size();
    }


    public void removePassengerFromPlane() {
        Passenger passengerRemoved = null;
        if (this.capacity() > 0){
            passengerRemoved = this.capacity.remove(0)
        }
        return passengerRemoved
    }

    public boolean hasP
}
