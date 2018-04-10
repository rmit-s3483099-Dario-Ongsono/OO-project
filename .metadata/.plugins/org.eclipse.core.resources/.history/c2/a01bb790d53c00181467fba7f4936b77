package gameView;

import gameModel.Board;
import javafx.scene.Group;
import javafx.scene.layout.Pane;
// This class should be in Model not View.
public class BoardView {
//	private int tilesize;
//	private int width;
//	private int height;

	private Group tileGroup;
	private Group heroGroup;
	private Board board;

//	public BoardView(int tilesize, int width, int height, Group tileGroup, Group heroGroup){
//		this.tilesize = tilesize;
//		this.width = width;
//		this.height = height;
//		this.tileGroup = tileGroup;
//		this.heroGroup = heroGroup;
//	}

	public BoardView(Board board, Group tileGroup, Group heroGroup){
		this.board = board;
		this.tileGroup = tileGroup;
		this.heroGroup = heroGroup;
	}

	public Pane displayBoard(){ //This method should be moved into a new 'BoardView' class in View package
		Pane gameBoard = new Pane();
		gameBoard.setPrefSize(board.getTileSize() * board.getWidth(), board.getTileSize() * board.getHeight());

		gameBoard.getChildren().addAll(tileGroup, heroGroup);
		return gameBoard;
	}




}
