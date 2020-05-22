package bicycles.models;

public class TandemBike extends BicycleBase {

    public void accelerate() {
        changeSpeed(12);
    }

    public void brake() {
        changeSpeed(-7);
    }
}
