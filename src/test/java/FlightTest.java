import org.junit.Before;

public class FlightTest {

    private Flight flight;
    private Plane Boeing747;


    proPlane plane;
    Passenger passenger1;
    Passenger passenger2;
    FlightNo flightNo;
    Destination destination;
    DepartureTime departureTime;



    @Before
    public void setUp(){
        flight = new Flight("Boeing747", 3, 550);
        passenger1 = new Passenger("John", 250, 2, 40);
        passenger2 = new Passenger("Bob", 50, 1, 15);
        flightNo = new FlightNo ("BA123");
        destination = new Destination


        flight.addPassenger("John");
        flight.addPassenger("Bob");









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
