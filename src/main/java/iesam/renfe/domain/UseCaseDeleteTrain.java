package iesam.renfe.domain;

public class UseCaseDeleteTrain {
    private TrainRepository trainRepository;

    public UseCaseDeleteTrain(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public void execute(String id) {
        trainRepository.deleteTrain(id);
    }
}
