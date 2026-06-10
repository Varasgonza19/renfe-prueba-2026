package iesam.renfe.mocks;

import iesam.renfe.domain.GetTrainsUseCase;
import iesam.renfe.domain.Train;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GetTrainsUseCasesTest {
    @Test
    public void shouldReturnList(){
        TrainMockRepository trainMockRepository = new TrainMockRepository();
        GetTrainsUseCase getTrainsUseCase = new GetTrainsUseCase(trainMockRepository);

        ArrayList<Train> trains = getTrainsUseCase.execute();

        assertNotNull(trains);
        assertEquals(3,trains.size());
        assertEquals("MDH-002",trains.get(0).getId());
    }

    @Test
    public void shouldReturnEmptyList(){
        EmptyTrainMocksRepository emptyTrainMocksRepository = new EmptyTrainMocksRepository();
        GetTrainsUseCase getTrainsUseCase = new GetTrainsUseCase(emptyTrainMocksRepository);

        ArrayList<Train> trains = getTrainsUseCase.execute();

        assertNotNull(trains);
        assertEquals(0,trains.size());

    }

    @Test
    public void shouldReturnNullList(){
        NullTrainMockRepository nullTrainMockRepository = new NullTrainMockRepository();
        GetTrainsUseCase getTrainsUseCase = new GetTrainsUseCase(nullTrainMockRepository);

        ArrayList<Train> trains = getTrainsUseCase.execute();

        assertNotNull(trains);


    }

}
