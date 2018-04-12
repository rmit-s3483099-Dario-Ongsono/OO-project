package bin;



import java.util.ArrayList;

import gameController.HeroController;
import gameController.TileController;
import gameModel.*;
import gameView.*;
import javafx.scene.Group;
import javafx.scene.paint.Color;

public class Controller {
	private BoardView gameBoard;
	private TileView tileView;
	private Group tileGroup;
	private Group heroGroup;
	private TileView[][] tileArray;
	private ArrayList<HeroView> heroArray;
	private Board board;


	private int TILE_SIZE;
	private int WIDTH;
	private int HEIGHT;
	private TileController tilegenerator;
	private HeroController heroGenerator;


//	Overall comment for above variables:
//		these variables should be inside the model package because the controller
//		package shouldn't need to know how big of a board size it needs to make or
//		how many number of heroes the board would have

	public Controller(){
		board = new Board();

		TILE_SIZE = board.getTileSize();
		WIDTH = board.getWidth();
		HEIGHT = board.getHeight();

		tilegenerator = new TileController(WIDTH, HEIGHT, TILE_SIZE);
		heroGenerator = new HeroController(WIDTH, HEIGHT, TILE_SIZE);

		tileArray = new TileView[WIDTH][HEIGHT];
		heroArray = new ArrayList();
//		tileGroup = createTiles();
		tileGroup = tilegenerator.createTiles(heroArray, tileArray);
		heroGroup = heroGenerator.createHeros(heroArray, tileArray);

		gameBoard = new BoardView(board.getWidth(), board.getHeight(), board.getTileSize(), tileGroup, heroGroup);

	}

/*********************************no delete******************************/
//	private Group createTiles(){
//		Group group = new Group();
//		for(int x = 0; x < WIDTH; x++){
//			for(int y = 0; y < HEIGHT; y++){
//				TileView tileView = new TileView(x, y, new Tile(TILE_SIZE).getSideSize());
//
//				tileView.setOnMouseClicked(e ->{
//					if(tileView.isReady()){
//						for(int i = 0; i < heroArray.size(); i++){
//							if(heroArray.get(i).isSelected()){
//								heroArray.get(i).move(tileView.getLocX(), tileView.getLocY());
//							}
//						}
//					}
//					clean();
//				});
//
//				tileArray[x][y] = tileView;
//
//				group.getChildren().add(tileView);
//			}
//		}
//		return group;
//	}
	/*********************************no delete******************************/

//	private Group createHeros(){
//		Group group = new Group();
//		ArrayList<Hero> r = new ArrayList();
//		r.add(new Warrior(WIDTH, HEIGHT, PlayerType.BLUE));
//		r.add(new Warrior(WIDTH, HEIGHT, PlayerType.RED));
//
//		r.add(new Support(WIDTH, HEIGHT, PlayerType.BLUE));
//		r.add(new Support(WIDTH, HEIGHT, PlayerType.RED));
//
//		r.add(new Ranger(WIDTH, HEIGHT, PlayerType.BLUE));
//		r.add(new Ranger(WIDTH, HEIGHT, PlayerType.RED));
//
//		for(Hero a : r){
//			HeroView heroView = new HeroView(a.getStartX(), a.getStartY(),a.getPlayerType(), a.getRoleType(), TILE_SIZE);
//			heroArray.add(heroView);
//
//
//
//			heroView.setOnMouseClicked(e ->{
//				a.move(heroView.getLocX(), heroView.getLocY());
//
//				for(int i = 0; i < a.getValidX().length; i++){
//					showValidTiles(tileArray, a.getValidX()[i], a.getValidY()[i]);
//				}
//			});
//			group.getChildren().add(heroView);
//		}
//
//		return group;
//	}
//
//
//
//
//
//	private void showValidTiles(TileView[][] tile, int x, int y){
//		tile[x][y].setFill(Color.GREEN);
//		tile[x][y].setReady(true);
//	}

	/*********************************no delete******************************/
//	private void clean(){
//		for(int x = 0; x < WIDTH; x++){
//			for(int y = 0; y < HEIGHT; y++){
//				tileArray[x][y].setDefault();
//			}
//		}
//
//		for(int i = 0; i < heroArray.size(); i++){
//			heroArray.get(i).setDefault();
//		}
//	}
	/*********************************no delete******************************/

	public BoardView getGameBoard(){
		return gameBoard;
	}

}
