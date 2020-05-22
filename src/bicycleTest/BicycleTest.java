package bicycleTest;
import bicycles.Bicycle;
import bicycles.BicycleFromSpec;
import bicycles.BikeRide;
import bicycles.BikeRideThree;
import bicycles.models.BicycleBase;
import bicycles.models.RoadBike;
import bicycles.models.TandemBike;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BicycleTest {
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

        assertEquals(20, bicycle.currentSpeed());
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

    @Test
    public void BicycleFromSpec(){
      BicycleSpecificattion mountainBike = new BicycleSpecification(7,4);


        BicycleBase bicycle = new BicycleFromSpec();


    }


}
