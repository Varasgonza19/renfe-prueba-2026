package iesam.renfe.presentation;

import iesam.renfe.data.TrainDataRepository;
import iesam.renfe.domain.*;

import java.util.ArrayList;

public class TrainView {

    public static void saveTrain() {

        Train train = new Train("MHD-001","Regional","300","200","50€");
        UseCaseSaveTrain useCaseSaveTrain = new UseCaseSaveTrain(new TrainDataRepository());
        useCaseSaveTrain.execute(train);
        System.out.println("Train saved :: " + train);

    }

    public static void prints() {

        GetTrainsUseCase getTrainsUseCase = new GetTrainsUseCase(new TrainDataRepository());
        ArrayList<Train> trains = getTrainsUseCase.execute();
        System.out.println(trains);
        System.out.println("List Trains");
        System.out.println(trains);

    }

    public static void deleteTrain() {
        UseCaseDeleteTrain useCaseDeleteTrain = new UseCaseDeleteTrain(new TrainDataRepository());
        useCaseDeleteTrain.execute("MHD-001");
        System.out.println("Train deleted :: " + "MHD-001");
    }

}
