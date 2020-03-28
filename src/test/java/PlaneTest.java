import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;
    private Passenger passenger;

    @Before
    public void setUp(){
        plane = new Plane("BA268", 100, 150, 180.80 );
        passenger = new Passenger("Jason Hockey", 550, 2, 40);
        passenger = new Passenger("Fred Kruger", 600, 1, 23);
    }


    @Test
    public void canAddPassengerToPlane(Passenger passenger){
        plane.addPassenger(passenger);
        assertEquals(1, plane.getCapacity());
    }

    @Test
    public void canAddPassengerToPlane(Passenger passenger){
        plane.addPassenger(passenger);
        assertEquals(1, plane.getNumberOfPassengers.size());
        assertEquals(5, passenger.getMoney());
        assertEquals(5, plane.getTicketCost());
    }

    @Test
    public void canAddNoBagsToPlane(){
        passenger.canAddPassengerBagsToPlane(passengerBags, 2);
        assertEquals(148, plane.getMaxNoOfBags);
    }



}