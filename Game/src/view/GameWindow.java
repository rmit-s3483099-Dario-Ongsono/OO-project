package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameWindow extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Board game = new Board();

		Scene scene = new Scene(game.displayBoard());
		primaryStage.setTitle("Panda Game");
		primaryStage.setScene(scene);
		primaryStage.show();
	}


	public static void main(String[] args){
		launch();
	}
}
