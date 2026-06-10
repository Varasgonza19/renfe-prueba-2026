package iesam.renfe.presentation;

import iesam.renfe.data.TrainDataRepository;
import iesam.renfe.domain.Train;
import iesam.renfe.domain.TrainRepository;
import iesam.renfe.domain.UseCaseSaveTrain;

public class TrainView {

    public static void saveTrain() {

        Train train = new Train("MHD-001","Regional","300","200","50€");
        UseCaseSaveTrain useCaseSaveTrain = new UseCaseSaveTrain(new TrainDataRepository());
        useCaseSaveTrain.execute(train);
        System.out.println("Train saved :: " + train);

    }

}
