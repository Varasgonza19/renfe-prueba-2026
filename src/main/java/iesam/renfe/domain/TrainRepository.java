package iesam.renfe.domain;

import java.util.ArrayList;

public interface TrainRepository {
    void saveTrain(Train train);
    ArrayList<Train> getTrains();
    void deleteTrain(String id);
}
