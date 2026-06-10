package iesam.renfe.data;

import iesam.renfe.domain.Train;
import iesam.renfe.domain.TrainRepository;

import java.util.ArrayList;
import java.util.Objects;

public class TrainMemLocalDataSource {

    private ArrayList<Train> storage = new ArrayList<>();

    private TrainMemLocalDataSource instance = null;

    public TrainMemLocalDataSource getInstance() {
        if(instance == null){
            instance = new TrainMemLocalDataSource();
        }
        return instance;
    }

    public ArrayList<Train> findAll() {
        return storage;
    }

    public void save(Train train) {
        storage.add(train);
    }

    public void delete(String trainId) {
        storage.removeIf(train -> Objects.equals(train.getId(), trainId));
    }
}
