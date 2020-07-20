package bicycles;
public class
BikeRideOne implements BikeRide{

   // private int speed = this.speed;


      public void ride(Bicycle bicycle){
         bicycle.accelerate();
          bicycle.accelerate();
          bicycle.accelerate();
          bicycle.brake();
          bicycle.brake();
          bicycle.accelerate();
          bicycle.currentSpeed();

     }

           public BikeRideOne(Bicycle bicycle){
          //BikeRide.ride(bicycle);
           }
}


