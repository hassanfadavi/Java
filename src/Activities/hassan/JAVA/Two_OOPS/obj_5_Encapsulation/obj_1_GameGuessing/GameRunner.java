package Activities.hassan.JAVA.Two_OOPS.obj_5_Encapsulation.obj_1_GameGuessing;

public class GameRunner {

    public static void main(String[] args) {

        GameConfig config = new GameConfig(1, 100);
        FeedBack feedBack = new FeedBack();
        UserInput userInput = new UserInput();
        GuessingGame game = new GuessingGame(
                config,
                feedBack,
                userInput
        );

        game.startGame();

    }

}
