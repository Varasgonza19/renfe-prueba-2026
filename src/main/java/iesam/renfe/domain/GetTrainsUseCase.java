package iesam.renfe.domain;

import java.util.ArrayList;

public class GetTrainsUseCase {
    private TrainRepository trainRepository;

    public GetTrainsUseCase(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public ArrayList<Train> execute()
    {
        return trainRepository.getTrains();
    }
}
