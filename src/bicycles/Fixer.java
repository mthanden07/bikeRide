package bicycles;

import bicycles.models.BicycleBase;
import bicycles.models.BikeType;

public class Fixer extends BicycleBase {

    public void accelerate() {
        changeSpeed(20);
    }

    public void brake() {
        changeSpeed(-4);
    }

    @Override
    public BikeType getBicycleType() {
        return BikeType.Fixer;
    }
}
