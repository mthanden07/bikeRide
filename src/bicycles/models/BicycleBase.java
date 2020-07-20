package bicycles.models;
import bicycles.Bicycle;

public abstract class BicycleBase implements Bicycle {
    protected int speed = 0;


    protected void changeSpeed(int changeSpeed) {
        this.speed += changeSpeed;
    }

    public int currentSpeed() {
        return this.speed;
    }

    public int stop() {
        return this.speed = 0;
    }
    public BikeType getBicycleType(){


    }
}