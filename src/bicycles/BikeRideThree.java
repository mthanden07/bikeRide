package bicycles;

public class BikeRideThree implements BikeRide{
// extra cautious ride.
    public void ride(Bicycle bicycle){
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();

    }

    public BikeRideThree(Bicycle bicycle){
    }



}
