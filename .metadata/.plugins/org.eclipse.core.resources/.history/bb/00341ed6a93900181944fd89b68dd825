package gameView;

import gameController.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class GameFrame extends Application{
	private final int tile_Size = 50;
	private final int board_Width = 12;
	private final int board_Height = 14;

	@Override
	public void start(Stage primaryStage) throws Exception {
		Board gameBoard = new Board(tile_Size, board_Width, board_Height);

		Scene scene = new Scene(gameBoard.displayBoard());
		primaryStage.setTitle("Panda Game");
		primaryStage.setScene(scene);
		primaryStage.show();

	}




}
