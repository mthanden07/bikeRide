package bicycles;

class BicycleSpecification {
    private int accelerationSpeed;
    private int brakeSpeed;


    BicycleSpecification(int accelerationSpeed, int brakeSpeed) {
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;

    }

    public int getAccelerationSpeed() {
        return accelerationSpeed;
    }

    public int getBrakeSpeed() {
        return brakeSpeed;
    }
}
