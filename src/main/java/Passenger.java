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

    public int hasMoney(){
        return this.money;
    }
//
    public boolean InsufficientMoney(int amount){
        return this.money >= amount;
    }

    public void payMoney(int amount) {
        if (money >= amount){
            this.money -= amount;
        }
    }

}
