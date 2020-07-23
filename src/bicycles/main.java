package bicycles;

import bicycles.models.BikeType;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.TandemBike;

public class main {



             public static void main(String[] args) {


              //   BikeType.MountainBik
                 //   e= new RoadBike();      // an instance of its own...direct.

             //    Bicycle bicycle = new MountainBike();    // an instance of our Bicycle interface via our abstract base class.

              //   BicycleBase bicycleBase = new RoadBike(); // an instance through extension and implements interface.

                FunRide funRide = new FunRide(5);
                funRide.accept(new MountainBike());
                 funRide.accept(new MountainBike());
                 funRide.accept(new MountainBike());
                 funRide.accept(new RoadBike());
                 funRide.accept(new TandemBike());
                 funRide.getCountForType(BikeType.MountainBike);

                 System.out.println(funRide.list);

    }
    
    
    




}
