package bicycles;

public interface Bicycle {
    public int speed = 0;

    public void accelerate();
    public void brake();
    public int currentSpeed();
    public int stop();
  //  public int changeSpeed();

}