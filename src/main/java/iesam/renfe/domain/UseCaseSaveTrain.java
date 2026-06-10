package iesam.renfe.domain;

public class UseCaseSaveTrain {

    private TrainRepository trainRepository;

    public UseCaseSaveTrain(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public void execute(Train train) {
        trainRepository.saveTrain(train);
    }
}
