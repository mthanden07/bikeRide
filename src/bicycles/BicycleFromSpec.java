package bicycles;

import bicycles.models.BicycleBase;
import bicycles.models.BikeType;

public class BicycleFromSpec extends BicycleBase{
    private BicycleSpecification bicycleSpecification;







    public BicycleFromSpec(BicycleSpecification bicycleSpecification){

        this.bicycleSpecification = bicycleSpecification;
    }
//    @Override

        //    int speed = 0;
    public void accelerate(){
        this.changeSpeed(bicycleSpecification.getAccelerationSpeed());
    }


    @Override
    public void brake() {
        this.changeSpeed(bicycleSpecification.getBrakeSpeed());
    }

     public BikeType getBicycleType(){
        return (BikeType) bicycleSpecification.getBicycleType();}

}
