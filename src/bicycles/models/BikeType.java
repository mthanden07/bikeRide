package bicycles.models;

import bicycles.Bicycle;
import bicycles.Fixer;

public enum BikeType {

    MountainBike(new MountainBike()), RoadBike(new RoadBike()), TandemBike(new TandemBike()), Fixer(new Fixer());

    Bicycle bicycle;


     BikeType(Bicycle bikeType) {
        bicycle = bikeType;

    }


}
