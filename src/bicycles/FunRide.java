package bicycles;

import bicycles.models.BikeType;

import java.util.ArrayList;
import java.util.List;

public class FunRide {

    int countForType = 0;
    int countForRoadBikes = 0;
    int countForMountainBikes = 0;
    int countForTandem = 0;
    int max = 0;
    int countBike = 0;
    BikeType bikeType;

    // private enum BicycleType {RoadBike,MountainBike,Tandem}
    private BicycleSpecification bicycleSpecification;
    public List<Bicycle> list = new ArrayList<Bicycle>();

    int bicycleCount = 0;

    public FunRide(int max) {
        this.max = max;
    }


    public void accept(Bicycle bicycle) {

        if (list.size() < max) {
            list.add(bicycle);
            this.bicycleCount++;
        }

    }

    public int getCountForEntered() {
        System.out.println(bicycleCount + "  Amount of bikes entered");
        return bicycleCount;
    }


    public int getCountForType(BikeType bikeType) {

      //  this.bikeType = bikeType;

       int countSum = 0;


        for (Bicycle bicycle : list) {
            if (bicycle.getBicycleType().equals(bikeType)) {
                countSum++;
            }

        }
        return countSum;
         }

    }

