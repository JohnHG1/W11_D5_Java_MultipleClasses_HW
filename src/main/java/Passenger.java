public class Passenger {


    public String name;
    public int money;
    public int passengerBags;
    public int bagWeight;


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
