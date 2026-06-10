package iesam.renfe.presentation;

import iesam.renfe.data.TrainDataRepository;
import iesam.renfe.domain.GetTrainsUseCase;
import iesam.renfe.domain.Train;
import iesam.renfe.domain.TrainRepository;
import iesam.renfe.domain.UseCaseSaveTrain;

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

    }

}
