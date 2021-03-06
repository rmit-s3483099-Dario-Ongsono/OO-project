package view;

import controller.Location;
import controller.Move;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.TestRole;
/**
 *
 * @author Yu Liu makes GUI
 * @version 0.01
 *
 */
public class Window extends Application{
	public static final int SQUARE_SIZE = 50;
	public static final int WIDTH = 13;
	public static final int HEIGHT = 15;

	// 2D array for Square class can be used? need be tested -----question by Vincent

	private Square[][] board = new Square[WIDTH][HEIGHT];

	//***********************************************

	private Group squareGroup = new Group();
	private Group pieceGroup = new Group();
	private int countR = 1, countB = 1;

	private Pane getBoard(){
		Pane root = new Pane();
		root.setPrefSize(SQUARE_SIZE * WIDTH, SQUARE_SIZE * HEIGHT);

		for (int y = 0; y < HEIGHT; y++){
			for (int x = 0; x < WIDTH; x++){
				Square square = new Square(x, y);
				board[x][y] = square;

				squareGroup.getChildren().add(square);

				TestRole role = null;

				if(y == 0 && x % 2 == 0 && countB < 4){
					role = makeHero(true, x, y);

				}
				else if(y == 5 && x % 2 == 0 && countR < 4){
					role = makeHero(false, x, y);
				}

				if (role != null) {
					square.setPiece(role);
	                pieceGroup.getChildren().add(role);
	            }
			}
		}
		root.getChildren().addAll(squareGroup, pieceGroup);
		return root;
	}


	public TestRole makeHero(boolean type, int x, int y){
		TestRole hero;
		if(type)
			hero = new TestRole(type ,x, y, countB++);
		else
			hero = new TestRole(type ,x, y, countR++);

		hero.setOnMouseClicked(e ->{

			//turns switch, red first
			if(Location.getTurn() % 2 == 0 && hero.getType()){
				Location.selectPiece(hero);
				Move.detectValidSquare(hero, board);
			}else if(Location.getTurn() % 2 != 0 && !hero.getType()){
				Location.selectPiece(hero);
				Move.detectValidSquare(hero, board);
			}else{
				Alarm.display();
				hero.getBg().setStroke(Color.BLACK);
			}

		});
		return hero;
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
