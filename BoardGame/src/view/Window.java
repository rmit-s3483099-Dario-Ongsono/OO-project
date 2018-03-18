package view;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
/**
 * 
 * @author Yu Liu makes GUI
 * @version 0.01
 * 
 */
public class Window extends Application{
	public static final int SQUARE_SIZE = 100;
	public static final int WIDTH = 8;
	public static final int HEIGHT = 10;
	
	private Group squareGroup = new Group();
	private Group pieceGroup = new Group();
	
	private Pane getBoard(){
		Pane root = new Pane();
		root.setPrefSize(SQUARE_SIZE * WIDTH, SQUARE_SIZE * HEIGHT);
		root.getChildren().addAll(squareGroup);
		for (int y = 0; y < HEIGHT; y++){
			for (int x = 0; x < WIDTH; x++){
				Square square = new Square(x, y);
				
				squareGroup.getChildren().add(square);
			}
		}
		
		
		
		return root;
	}
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Scene scene = new Scene(getBoard());
		primaryStage.setTitle("Panda Game");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	public static void main(String[] args){
		launch();
	}
}
