package bicycles.models;


public class MountainBike extends BicycleBase {
   // public int speed = 0;

    public void accelerate() {
        changeSpeed(5);
    }

    public void brake() {
        changeSpeed(-3);
    }
  //  public int currentSpeed(){ return this.speed; }
  //  public int stop(){ return this.speed =0;}
  //  public int getSpeed(){return this.speed;}

}

