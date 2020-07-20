package bicycles;

import bicycles.models.BikeType;

public class

BicycleSpecification {
    private int accelerationSpeed;
    private int brakeSpeed;

  // public enum BicycleType {RoadBike,MountainBike,Tandem}




        private BikeType bicycleType;


  public  BicycleSpecification(BikeType bicycleType, int accelerationSpeed, int brakeSpeed  ) {
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
        this.bicycleType = bicycleType;


    }

    public int getAccelerationSpeed() {
        return accelerationSpeed;
    }

    public int getBrakeSpeed() {
        return brakeSpeed;
    }

    public Enum<BikeType> getBicycleType(){return bicycleType; }
}


