import java.util.ArrayList;

public class Flight {
    private Plane plane;
    private String flightNum;
    private String destination;
    private double depTime;


    public Flight(String flightNum, String destination, double depTime, Plane plane) {
        this.flightNum = flightNum;
        this.destination = destination;
        this.depTime = depTime;
        this.plane = plane;
    }

    public String getFlightNum() {
        return this.flightNum;
    }

    public String getDestination() {
        return this.destination;
    }

    public double getDepTime() {
        return this.depTime;
    }

}

