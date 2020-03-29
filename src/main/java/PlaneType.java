public enum PlaneType {


    BOEING747(3, 550),
    AIRBUS300(5,100);

    public final int capacity;
    public final int maxWeight;


    PlaneType(int capacity, int maxWeight){
        this.capacity = capacity;
        this.maxWeight = maxWeight;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getMaxWeight() {
        return this.maxWeight;
    }
}