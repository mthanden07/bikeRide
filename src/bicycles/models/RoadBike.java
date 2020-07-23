package bicycles.models;

public class RoadBike extends BicycleBase {

    //
    //   public int speed;

    public void accelerate() {
        changeSpeed(11);
    }

    public void brake() {
        changeSpeed(-4);
    }

    @Override
    public BikeType getBicycleType() {
        return BikeType.RoadBike;
    }

}


