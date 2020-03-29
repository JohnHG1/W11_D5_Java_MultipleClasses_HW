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


    @Test
    public void hasMoney(){
        passenger.hasMoney();
        assertEquals(250, passenger.hasMoney());
    }

    @Test
    public void cannotPayMoneyInsufficientFunds(){
        passenger.payMoney(450);
        assertEquals(250, passenger.hasMoney());
    }


}
