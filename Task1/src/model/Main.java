package model;
import model.entity.*;
import model.service.*;

import java.util.*;

import static model.service.TrainBuilderScheme.*;

public class Main {

    public static void main(String[] args) {
//        Carriage wagon = new CarriageWagonBuilder()
//                .buildCarriageType(Carriage.CarriageType.Seating1Class)
//                .buildTrackSize(TrackSize.EASTERN_TRACK)
//                .buildPassengerCapacity(10)
//                .getBuiltWagon();
//        System.out.println(wagon.toString());
//        System.out.println(wagon.getClass());
//        Locomotive locomotive = new LocomotiveBuilder()
//                .buildLocomotiveEngine(Locomotive.Engine.Diesel)
//                .buildVehicleFunction(RailwayVehicle.Function.Passenger)
//                .getBuiltLocomotive();
//        System.out.println(locomotive);
//        Train train = new PassengerTrainBuilder()
//                .buildWagons(wagon)
//                .buildLocomotive(locomotive)
//                .getBuiltTrain();
//        RailwayVehicle railwayVehicle = new Carriage(TrackSize.EURO_TRACK,Carriage.CarriageType.Berth,
//                20);
//        System.out.println(((Carriage) railwayVehicle).getCarriageType());

//        List<DBVehicleTypes> fromDB = new ArrayList<>();
//        for (DBVehicleTypes dbVehicleTypes: DBVehicleTypes.values()){
//            fromDB.add(dbVehicleTypes);
//        }
        System.out.println("I have this number of railway vehicles in my garage: "+DBVehicleTypes.values().length );
        System.out.println("Lets construct a PASSENGER_SLEEPING_TRAIN");


          List<RailwayVehicle> scheme = new ArrayList<>
                  (Arrays.asList(PASSENGER_SLEEPING_TRAIN.getTrainBuilderScheme()));

        Set<RailwayVehicle> trainParts = new HashSet<>(scheme);

        RailwayVehicle rail[] = new RailwayVehicle[scheme.size()];
            for(DBVehicleTypes w: DBVehicleTypes.values()){
                if(trainParts.contains(w.getRailwayVehicle())){
                    rail[scheme.indexOf(w.getRailwayVehicle())]=w.getRailwayVehicle();
                }
        }

        for(RailwayVehicle v:rail){
            System.out.println(v);
        }


        }


    }

