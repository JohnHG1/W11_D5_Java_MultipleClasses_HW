import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightControlTest {

    public Flight flight;
    public Plane plane;
    public Passenger passenger;
    public Passenger passenger1;
    public Passenger passenger2;
    public Passenger passenger3;
    public FlightControl flightControl;

    @Before
    public void setUp() {
        plane = new Plane(PlaneTypes.BOEING777);
        flight = new Flight(plane, "Edi443", Airports.EDI, Airports.BEL, "2020-04-29T22:00");
        passenger = new Passenger("Zsolt", 1);
        passenger1 = new Passenger("Sky", 1);
        passenger2 = new Passenger("Louise", 1);
        passenger3 = new Passenger("John", 1);
        flightControl = new FlightControl();
    }

    @Test
    public void shouldStartWithNoFlights(){
        assertEquals(0, flightControl.countFlights());
    }

    @Test
    public void canCalculateBaggageForFlight(){
        assertEquals(100, flightControl.availableBaggage(flight));
    }

    @Test
    public void canCalculateTotalBaggageBookedByPassengers(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        assertEquals(75, flightControl.baggageBooked(flight));
    }

    @Test
    public void canCalculateRemainingBaggage(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        assertEquals(25, flightControl.remainingBaggage(flight));
    }

    @Test
    public void canSortPassengersBySeatNumber(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        passenger1.setSeat(3);
        passenger2.setSeat(1);
        passenger3.setSeat(2);
        ArrayList<Passenger> sortedPassengers = flightControl.sortPassengersBySeat(flight);
        assertEquals(passenger2, sortedPassengers.get(1));
    }

    @Test
    public void canFindPassengerBySeatNumber(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        passenger1.setSeat(3);
        passenger2.setSeat(1);
        passenger3.setSeat(2);
        flightControl.sortPassengersBySeat(flight);
        assertEquals(passenger3, flightControl.findPassengerBySeat(flight, 2));
    }

}
