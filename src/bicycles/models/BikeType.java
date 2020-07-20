package bicycles.models;

import bicycles.Bicycle;

public enum BikeType {

    MountainBike(new MountainBike()), RoadBike(new RoadBike()), TandemBike(new TandemBike());

    Bicycle bicycle;


    BikeType(Bicycle bikeType) {
        bicycle = bikeType;

    }


}
