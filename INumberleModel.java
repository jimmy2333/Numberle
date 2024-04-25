import java.util.List;
import java.util.Observable;
import java.util.Observer;
//public interface INumberleModel {
//    int MAX_ATTEMPTS = 6;
//
//    void initialize();
//    boolean processInput(String input);
//    boolean isGameOver();
//    boolean isGameWon();
//    String getTargetNumber();
//    StringBuilder getCurrentGuess();
//    int getRemainingAttempts();
//    void startNewGame();
//}
public interface INumberleModel {
    int MAX_ATTEMPTS = 6;

    void initialize();
    String processInput(String input);
    boolean isGameOver();
    boolean isGameWon();
    String getTargetEquation();
    int getRemainingAttempts();
    void startNewGame();
    char[] getFeedback();
    void addObserver(Observer o); // 添加观察者的方法
}
