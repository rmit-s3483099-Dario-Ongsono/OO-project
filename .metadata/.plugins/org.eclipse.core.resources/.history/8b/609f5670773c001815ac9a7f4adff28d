package gameView;

import gameController.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class GameFrame extends Application{

 
	@Override
	public void start(Stage primaryStage) throws Exception {
		Controller con = new Controller();

		Scene scene = new Scene(con.getGameBoard().displayBoard());
		primaryStage.setTitle("Panda Game");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main (String[] args){
		launch();
	}
}
