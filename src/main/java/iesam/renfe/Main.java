package iesam.renfe;

import iesam.renfe.presentation.TrainView;

public class Main {
    public static void main(String[] args) {
        TrainView.prints();
        TrainView.saveTrain();
        TrainView.prints();
        TrainView.deleteTrain();
        TrainView.prints();
    }
}
