import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

        private Passenger passenger;

    @Before
    public void setUp(){
        passenger = new Passenger("John HG", 250, 2, 40);
    }

    @Test
    public void hasName(){
        assertEquals("John HG", passenger.getName());
    }

    @Test
    public void hasBags(){
        assertEquals(2, passenger.getNoOfBags());
    }

    @Test public void hasBagWeight(){
        assertEquals(5, passenger.getBagWeight());
    }

    @Test
    public void canPayMoney(){
        passenger.payMoney(150);
        assertEquals(100, passenger.getMoney());
    }

    @Test
    public void cannotPayMoneyInsufficientFunds(){
        passenger.payMoney(450);
        assertEquals(250, passenger.getMoney());
    }


}
