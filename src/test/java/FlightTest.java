import org.junit.Before;
import org.junit.Test;

import javax.print.attribute.standard.Destination;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;


    @Before
    public void setUp() {
        PlaneType planeType = PlaneType.BOEING747;
        Plane plane = new Plane(planeType);
        flight = new Flight("BA246", "Edinburgh", 16.00, plane);
    }

    @Test
    public void hasFlightNum(){
        assertEquals("BA246", flight.getFlightNum());
    }










//
//    @Test
//    public void passengerCountStartsAt0() {
//        assertEquals(0, plane.passengerCount());
//    }
//
//    @Test
//    public void bagWeightStartsAt0(){
//        assertEquals(0, plane.maxWeight() );
//    }
//
//    @Test
//    public void canAddPassengers() {
//        plane.addPassenger(passenger1);
//        assertEquals(1, plane.passengerCount());
//    }
//
//    @Test
//    public void cantAddPassengers() {
//        plane.addPassenger(passenger1);
//        plane.addPassenger(passenger2);
//        plane.addPassenger(passenger3);
//        assertEquals(2, plane.passengerCount());
//    }
//
//    @Test
//    public void canRemovePassengerFromPlane(){
//        plane.addPassenger(passenger1);
//        plane.removePassenger(passenger1);
//        assertEquals(0, plane.passengerCount());
//    }
//
//    @Test
//    public void canAddPassengerBags(){
//        plane.addPassenger.bagWeight(passenger1);
//        assertEquals(7, plane.maxWeight());
//    }




}
