import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    public Flight flight;
    public Plane plane;
    public Passenger passenger1;
    public Passenger passenger2;
    public Passenger passenger3;

    @Before
    public void setUp() {
        plane = new Plane(PlaneTypes.BOEING747);
        flight = new Flight(plane, "GL123", Airports.GTW, Airports.GLA, "2020-04-29T12:00");
        passenger1 = new Passenger("Paul", 1);
        passenger2 = new Passenger("Ringo", 1);
        passenger3 = new Passenger("George", 1);
    }

    @Test
    public void hasPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("GL123", flight.getFlightNumber());
    }

    @Test
    public void hasDestinationAirport(){
        assertEquals(Airports.GLA, flight.getDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals(Airports.GTW, flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals( "2020-04-29T12:00", flight.getDepartureTime());
    }

    @Test
    public void canChangeDepartureTime(){
        flight.setDepartureTime("2020-04-29T12:30");
        assertEquals("2020-04-29T12:30", flight.getDepartureTime());
    }

    @Test
    public void shouldStartWithNoPassengers(){
        assertEquals(0, flight.countPassengers());
    }

    @Test
    public void canGetAvailableSeats(){
        assertEquals(3, flight.availableSeats());
    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger1);
        assertEquals(1, flight.countPassengers());
    }

    @Test
    public void shouldNotAddPassenger__ifNoSpace(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger1);
        assertEquals(3, flight.countPassengers());
    }

    @Test
    public void shouldAssignFlightToPassengerOnBookIn(){
        flight.bookPassenger(passenger1);
        assertEquals(flight, passenger1.getFlight());
    }

    @Test
    public void shouldNotAssignDuplicateNumbers(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        passenger1.setSeat(1);
        passenger2.setSeat(2);
        passenger3.setSeat(3);
        flight.bookPassenger(passenger3);
        Integer num = 3;
        assertEquals(num, passenger3.getSeat());
    }

}