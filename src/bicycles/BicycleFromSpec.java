package bicycles;

import bicycles.models.BicycleBase;

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

     public void getBicycleType(){this.bicycleSpecification.getBicycleType();}

}
