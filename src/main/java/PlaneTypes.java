public enum PlaneTypes {

    BOEING747(5, 100),
    BOEING777(10, 200);

    private final int capacity;
    private final int totalWeight;

    PlaneTypes(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}