public class Plane {

    public PlaneType planeType;


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


