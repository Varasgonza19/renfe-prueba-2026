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

    @Override
    public ArrayList<Train> getTrains() {
        return dataSource.findAll();
    }

    @Override
    public void deleteTrain(String id) {
        dataSource.delete(id);
    }
}
