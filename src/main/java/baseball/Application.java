package baseball;

public class Application {

    public static void main(String[] args) {

        boolean restart;

        Alert.gameStartMessage();

        do {
            Game baseballGame = new Game();
            baseballGame.Start();
            restart = Game.reStart();

        } while (restart);

    }
}
