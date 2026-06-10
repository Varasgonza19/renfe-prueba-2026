package iesam.renfe.mocks;

import iesam.renfe.domain.Train;
import iesam.renfe.domain.UseCaseDeleteTrain;
import iesam.renfe.domain.UseCaseSaveTrain;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeleteTrainUseCaseTest {
@Test
    public void shouldCallSaveMethod() {
        //Given
        TrainMockRepository trainMockRepository = new TrainMockRepository();
        UseCaseDeleteTrain useCaseDeleteTrain = new UseCaseDeleteTrain(trainMockRepository);
       //When
        useCaseDeleteTrain.execute("MDH-003");

       //Then
        assertEquals(1,trainMockRepository.countDeleteMethod);

    }
}
