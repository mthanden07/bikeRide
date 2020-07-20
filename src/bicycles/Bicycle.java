package bicycles;

import bicycles.models.BikeType;

public interface Bicycle {
    public int speed = 0;

    public void accelerate();
    public void brake();
    public int currentSpeed();
    public int stop();
    public BikeType getBicycleType();


  //  public int changeSpeed();

}