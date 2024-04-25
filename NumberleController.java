//// NumberleController.java
//public class NumberleController {
//    private INumberleModel model;
//    private NumberleView view;
//
//    public NumberleController(INumberleModel model) {
//        this.model = model;
//    }
//
//    public void setView(NumberleView view) {
//        this.view = view;
//    }
//
//    public void processInput(String input) {
//        model.processInput(input);
//    }
//
//    public boolean isGameOver() {
//        return model.isGameOver();
//    }
//
//    public boolean isGameWon() {
//        return model.isGameWon();
//    }
//
//    public String getTargetWord() {
//        return model.getTargetNumber();
//    }
//
//    public StringBuilder getCurrentGuess() {
//        return model.getCurrentGuess();
//    }
//
//    public int getRemainingAttempts() {
//        return model.getRemainingAttempts();
//    }
//
//    public void startNewGame() {
//        model.startNewGame();
//    }
//}
import java.util.Observable;

public class NumberleController {
    private NumberleView view;
    private INumberleModel model;

    public NumberleController(INumberleModel model) {
        this.model = model;
    }

    public void setView(NumberleView view) {
        this.model.addObserver(view);
    }

    public String processInput(String input) {
        return model.processInput(input);
    }

    public boolean isGameOver() {
        return model.isGameOver();
    }

    public boolean isGameWon() {
        return model.isGameWon();
    }

    public String getTargetEquation() {
        return model.getTargetEquation();
    }

    public char[] getFeedback() {
        return model.getFeedback();
    }

    public int getRemainingAttempts() {
        return model.getRemainingAttempts();
    }

    public void startNewGame() {
        model.startNewGame();
    }
}

