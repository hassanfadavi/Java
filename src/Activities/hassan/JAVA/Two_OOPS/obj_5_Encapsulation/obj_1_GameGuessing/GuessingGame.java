package Activities.hassan.JAVA.Two_OOPS.obj_5_Encapsulation.obj_1_GameGuessing;

import java.util.Random;

public class GuessingGame {

    // Attributes
    private final GameConfig config;
    private final FeedBack feedBack;
    private final UserInput userInput;
    private final Random random;
    private final int computerGuessedNumber;
    private int userGuess;
    private int numberOfAttempts;


    // Constructor
    public GuessingGame(GameConfig config, FeedBack feedBack, UserInput userInput) {
        this.config = config;
        this.feedBack = feedBack;
        this.userInput = userInput;
        random = new Random();
        this.userGuess = 0;
        this.numberOfAttempts = 0;
        this.computerGuessedNumber = random.nextInt(
                ( config.getMax() - config.getMin() ) + config.getMin()
        );
    }

    public void startGame() {
        boolean hasUserGuessedTheNumber = false;

        feedBack.printWelcomeMessage();

        while (!hasUserGuessedTheNumber) {
            int userGuess = userInput.getUserInput();
            numberOfAttempts++;

            if (userGuess > computerGuessedNumber) {
                feedBack.printTooHighMessage();
            } else if (userGuess < computerGuessedNumber) {
                feedBack.printTooLowMessage();
            } else {
                hasUserGuessedTheNumber = true;
                feedBack.printFinalMessage(numberOfAttempts);

            }
        }
        userInput.closeScanner();
    }

}
