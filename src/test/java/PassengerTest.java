import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    public Passenger passenger;
    public Flight flight;
    public Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(PlaneTypes.BOEING777);
        flight = new Flight(plane, "GL767", Airports.GLA, Airports.EDI, "2020-04-30T09:10");
        passenger = new Passenger("Melinda", 3);

    }

    @Test
    public void hasName() {
        assertEquals("Melinda", passenger.getName());
    }

    @Test
    public void hasBags() {
        assertEquals(3, passenger.getBags());
    }

    @Test
    public void hasFlight(){
        passenger.addFlight(flight);
        assertEquals(flight, passenger.getFlight());
    }

    @Test
    public void canGetSeatNumber(){
        passenger.setSeat(10);
        Integer num = 10;
        assertEquals(num , passenger.getSeat());
    }


}
