package iesam.renfe.data;

import iesam.renfe.domain.Train;
import iesam.renfe.domain.TrainRepository;

import java.util.ArrayList;

public class TrainDataRepository implements TrainRepository {

    private TrainMemLocalDataSource dataSource = new TrainMemLocalDataSource().getInstance();

    @Override
    public void saveTrain(Train train) {
        dataSource.save(train);
    }
}
