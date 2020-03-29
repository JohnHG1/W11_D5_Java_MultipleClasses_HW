public class Plane {

    private PlaneType planeType;

    public Plane(String planeType) {
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return this.planeType;
    }

    public int getCapacity(){
        return this.planeType.getCapacity();
    }

    public int getMaxWeight(){
        return this.planeType.getMaxWeight();
    }

}
