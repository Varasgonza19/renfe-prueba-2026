package iesam.renfe.mocks;

import iesam.renfe.domain.Train;
import iesam.renfe.domain.TrainRepository;

import java.util.ArrayList;

public class EmptyTrainMocksRepository implements TrainRepository {
    @Override
    public void saveTrain(Train train) {

    }

    @Override
    public ArrayList<Train> getTrains() {
        return new ArrayList<>();
    }

    @Override
    public void deleteTrain(String id) {

    }
}
