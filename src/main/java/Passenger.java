public class Passenger {


    private String name;
    private int money;
    private int passengerBags;
    private int bagWeight;


    public Passenger(String name, int money, int passengerBags, int bagWeight){
        this.name = name;
        this.money = money;
        this.passengerBags = passengerBags;
        this.bagWeight = bagWeight;
    }


    public String getName() {
        return name;
    }

    public int getNoOfBags() {
     return passengerBags;
    }

    public int getBagWeight() {
        return bagWeight;
    }

    public int getMoney(){
        return this.money;
    }

    public boolean sufficientMoney(int amount){
        return this.money >= amount;
    }

    public void payMoney(int amount) {
        if (money >= amount){
            this.money -= amount;
        }
    }

//    public void canAddPassengerBagsToPlane(int passengerBags, int maxNoOfBags){
//        if passenger.noOfBags >= plane.maxNoOfBags;
//        this.noOfBags -= plane.maxNoOfBags;
//    }
//
//



}
