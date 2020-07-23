package bicycles.models;


public class MountainBike extends BicycleBase {
   // public int speed = 0;

    public void accelerate() {
        changeSpeed(5);
    }

    public void brake() {
        changeSpeed(-3);
    }

    @Override
    public BikeType getBicycleType() {
        return BikeType.MountainBike;
    }

}

