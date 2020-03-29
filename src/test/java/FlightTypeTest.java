import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTypeTest {

    import org.junit.Before;
    import org.junit.Test;


    public class FlightTypeTest {


        @Before
        public void setUp(){
            plane = new Plane();
        }

        @Test
        public void hasCapacity(){
            assertEquals(3, plane.getCapacity());
        }

        @Test
        public void hasMaxWeight(){
            assertEquals(550, plane.getMaxWeight());
        }
    }

}

//import org.junit.Before;
//        import org.junit.Test;
//
//        import static org.junit.Assert.assertEquals;
//
//public class PlaneTest {
//    Plane plane;
//
//
//    @Before
//    public void setUp(){
//        plane = new Plane();
//    }
//
//    @Test
//    public void hasCapacity(){
//        assertEquals(3, plane.getCapacity());
//    }
//
//    @Test
//    public void hasMaxWeight(){
//        assertEquals(550, plane.getMaxWeight());
//    }
//}
