package gameController;

import com.sun.prism.paint.Color;

import gameModel.PlayerType;
import gameModel.RoleType;
import gameView.*;
import javafx.scene.Group;

public class Controller {
	private Board gameBoard;
	private TileView tileView;
	private Group tileGroup;
	private Group heroGroup;
	private TileView[][] tileArray;

	public static final int TILE_SIZE = 50;
	public static final int WIDTH = 12;
	public static final int HEIGHT = 14;

	public Controller(){
		tileGroup = createTilesView();
		heroGroup = createHerosView();
		gameBoard = new Board(TILE_SIZE, WIDTH, HEIGHT, tileGroup, heroGroup);
		tileArray = new TileView[WIDTH][HEIGHT];
	}



	public Group createTilesView(){
		Group tileGroup = new Group();

		for(int x = 0; x < WIDTH; x++){
			for(int y = 0; y < HEIGHT; y++){
				TileView tileView = new TileView(x, y, TILE_SIZE);

				tileArray[x][y] = tileView;

				tileGroup.getChildren().add(tileView);
			}
		}
		return tileGroup;
	}

	public Group createHerosView(){
		Group heroGroup = new Group();
		HeroView hero = new HeroView(3, 3, PlayerType.BLUE, RoleType.WARRIOR);
		tileArray[3][3].getTile().setHero(hero.getHero()); //may change hero.getHero() to heroView
		//TODO

		addHeroEvents(hero);

		//TODO

		heroGroup.getChildren().add(hero);
		return heroGroup;
	}

	private void addHeroEvents(HeroView hero){
		hero.setOnMousePressed(e ->{
			hero.pressed(); // change stroke color to white and turn boolean select to true






		});
	}

	private void addTileEvents(TileView tile){
		//TODO
	}

	public Board getGameBoard(){
		return gameBoard;
	}

}
