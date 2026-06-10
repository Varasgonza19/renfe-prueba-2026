package iesam.renfe.mocks;

import iesam.renfe.domain.Train;
import iesam.renfe.domain.TrainRepository;

import java.util.ArrayList;
import java.util.Arrays;

public class TrainMockRepository implements TrainRepository {
    public int countSaveMethod = 0;
    public int countDeleteMethod = 0;

    private ArrayList<Train> trains = new ArrayList<>(Arrays.asList(
            new Train("MDH-002","Regional","300","200","50€"),
            new Train("MDH-005","Ave","300","200","60€"),
            new Train("MDH-003","Regional","320","180","50€")
    ));
    @Override
    public void saveTrain(Train train) {
        trains.add(train);
        countSaveMethod++;
    }

    @Override
    public ArrayList<Train> getTrains() {
        return trains;
    }

    @Override
    public void deleteTrain(String id) {
        trains.removeIf(train -> train.getId().equals(id));
        countDeleteMethod++;
    }
}
