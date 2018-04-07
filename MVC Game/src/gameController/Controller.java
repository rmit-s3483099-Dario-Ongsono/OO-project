package gameController;

import gameModel.PlayerType;
import gameModel.RoleType;
import gameView.*;
import javafx.scene.Group;

public class Controller {
	private Board gameBoard;
	private TileView tileView;
	private Group tileGroup;
	private Group heroGroup;

	public static final int TILE_SIZE = 50;
	public static final int WIDTH = 12;
	public static final int HEIGHT = 14;

	public Controller(){
		tileGroup = createTilesView();
		heroGroup = createHerosView();
		gameBoard = new Board(TILE_SIZE, WIDTH, HEIGHT, tileGroup, heroGroup);
	}



	public Group createTilesView(){
		Group tileGroup = new Group();

		for(int x = 0; x < WIDTH; x++){
			for(int y = 0; y < HEIGHT; y++){
				TileView tileView = new TileView(x, y, TILE_SIZE);
				tileGroup.getChildren().add(tileView);
			}
		}
		return tileGroup;
	}

	public Group createHerosView(){
		Group heroGroup = new Group();
		HeroView hero = new HeroView(3, 3, PlayerType.BLUE, RoleType.WARRIOR);
		heroGroup.getChildren().add(hero);
		return heroGroup;
	}



	public Board getGameBoard(){
		return gameBoard;
	}

}
