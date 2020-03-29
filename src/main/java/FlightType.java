public class FlightType {

    FlightType("BA246", "Edinburgh", 16.30),
    FlightType("BA369", "LHR", 17.25);

    public final String flightNum;
    public final String destination;
    public final double departureTime;




    FlightType(String flightNum, String destination, double departureTime){
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public String getFlightNum(){
        return this.flightNum;
    }

    public String getDestination(){
        return this.destination;
    }

    public double getDepartureTime() {
        return this.departureTime;
    }


}

