package iesam.renfe.mocks;

import iesam.renfe.domain.Train;
import iesam.renfe.domain.UseCaseSaveTrain;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaveTrainUseCaseTest {
    @Test
    public void shouldCallSaveMethod() {
        //Given
        TrainMockRepository trainMockRepository = new TrainMockRepository();
        UseCaseSaveTrain useCaseSaveTrain = new UseCaseSaveTrain(trainMockRepository);
        Train train = new Train("MDH-006","Ave","250","200","45€");

        //When
        useCaseSaveTrain.execute(train);

        //Then
        assertEquals(1,trainMockRepository.countSaveMethod);
    }
}
