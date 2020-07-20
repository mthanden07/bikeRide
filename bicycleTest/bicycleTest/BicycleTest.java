package bicycleTest;


import bicycles.*;
import bicycles.models.BikeType;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.TandemBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BicycleTest {

  //  private boolean list;


    @Test
    public void shouldGetCount(){

        FunRide funRide = new FunRide(3);
        funRide.accept(new MountainBike());
        funRide.accept(new MountainBike());
      //  funRide.accept(new RoadBike());

      //  funRide.getCountForEntered();

        assertEquals(2,funRide.getCountForEntered());


    }
@Test
public void shouldNotAllowMoreThanTheConstructor(){

       FunRide funRide = new FunRide(4);
       funRide.accept(new MountainBike());
    funRide.accept(new MountainBike());
    funRide.accept(new MountainBike());
    funRide.accept(new MountainBike());
    funRide.accept(new MountainBike());
    funRide.accept(new MountainBike());

    assertEquals(6,funRide.getCountForEntered());


}


    @Test

    public void shouldAddBicycle(){

        FunRide funRide = new FunRide(3);
       Bicycle MountainBike = new MountainBike();
     //  BikeType MountainBike = bicycles.models.MountainBike;

//BikeType MountainBike ;
        BicycleSpecification bicycleSpecification = new BicycleSpecification(BikeType.MountainBike,5,3);
        BicycleFromSpec bicycleFromSpec = new BicycleFromSpec(bicycleSpecification);


        //BikeType

        //*************// make bicycles using the above bicycleSpecifications.
        //************// add bicycles with bike Types.


     //  BikeType mountainBike  = BikeType.MountainBike
        //
        funRide.accept(bicycleFromSpec);
          funRide.accept(new MountainBike());
        funRide.accept(new TandemBike());
      funRide.getCountForType(BikeType.MountainBike);

        System.out.println(funRide.list);

        assertEquals(1,funRide.getCountForType(BikeType.MountainBike) );

    }

    @Test

    public void shouldLoopThroughEnum(){

        BikeType bikeType;
try{
    int num = 5;


}catch (Exception e){


    System.out.println(e);

}




    }
















/*
    @Test
    public void mountAccellerate() {
        Bicycle bicycle = new MountainBike();
        bicycle.accelerate();
        assertEquals(5, bicycle.currentSpeed());
    }

    @Test
    public void mountBrake() {
        Bicycle bicycle = new MountainBike();
        bicycle.brake();
        assertEquals(-3, bicycle.currentSpeed());
    }

    @Test
    public void currentSpeed() {
        Bicycle bicycle = new MountainBike();
        bicycle.currentSpeed();
        assertEquals(1, bicycle.currentSpeed());
    }

    @Test
    public void shouldBrakeAndAccelerate() {

        Bicycle bicycle = new MountainBike();
        bicycle.brake();
        bicycle.accelerate();

        assertEquals(2, bicycle.currentSpeed());
    }

    @Test
    public void shouldMultipleAccelerate() {

        Bicycle bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();

        assertEquals(20, bicycle.currentSpeed());
    }

    @Test
    public void shouldMultipleAccelerateAndBrake() {

        Bicycle bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();

        assertEquals(14, bicycle.currentSpeed());
    }
}

    @Test
    public void shouldBeAbleToStop() {

        Bicycle bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.stop();


         assertEquals(0, bicycle.currentSpeed());

        }
}
*/
  @Test
    public void shouldAccellerate() {
        Bicycle bicycle = new RoadBike();
        bicycle.accelerate();
        assertEquals(11, bicycle.currentSpeed());
    }

    @Test
    public void shouldBrake() {
        Bicycle bicycle = new RoadBike();
        bicycle.brake();
        assertEquals(-3, bicycle.currentSpeed());
    }

    @Test
    public void currentSpeed() {
        Bicycle bicycle = new RoadBike();
        bicycle.currentSpeed();
        assertEquals(1, bicycle.currentSpeed());
    }

    @Test
    public void shouldBrakeAndAccelerate() {

        Bicycle bicycle = new RoadBike();
        bicycle.brake();
        bicycle.accelerate();

        assertEquals(2, bicycle.currentSpeed());
    }

    @Test
    public void shouldMultipleAccelerate() {


        Bicycle bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();

        assertEquals(2, bicycle.currentSpeed());
    }

    @Test
    public void shouldMultipleAccelerateAndBrake() {

        Bicycle bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();

        assertEquals(14, bicycle.currentSpeed());
    }

    @Test
    public void shouldBeAbleToStop() {

        Bicycle bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.stop();


        assertEquals(12, bicycle.currentSpeed());

    }
    @Test
    public void TandemAccelerate(){
      Bicycle bicycle = new TandemBike();
      bicycle.accelerate();
      assertEquals(12,bicycle.currentSpeed());
    }

    @Test
    public void TandemBrake(){
        Bicycle bicycle = new TandemBike();
        bicycle.brake();
        assertEquals(-7,bicycle.currentSpeed());
    }
    @Test
    public void bikeRideOne(){
        Bicycle bicycle = new TandemBike();
        BikeRide bikeRide = new BikeRideThree(bicycle);
       // bicycle.accelerate();
        bikeRide.ride(bicycle);
        assertEquals(34,bicycle.currentSpeed());
    }
/*
    @Test
    public void BicycleFromSpec(){
      BicycleSpecification bicycleSpecification = new BicycleSpecification(7,4, BicycleSpecification.BicycleType.RoadBike);

        BicycleFromSpec bicycleFromSpec = new BicycleFromSpec(bicycleSpecification);
        BikeRide bikeRide = new BikeRideOne(bicycleFromSpec);
        bikeRide.ride(bicycleFromSpec);


    }

 */
}
