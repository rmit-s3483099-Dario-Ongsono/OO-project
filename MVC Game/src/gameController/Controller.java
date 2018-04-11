package gameController;



import java.util.ArrayList;

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


	private int TILE_SIZE; //This should be in Model package in Board class, - Dario
										   //gameView package should have BoardView class instead - Dario

	private int WIDTH;   //this too - Dario
	private int HEIGHT;  //this too - Dario

	//private static final int HERO_NUM = 6; //This variable maybe should be in a class of its own (maybe) - Dario

//	Overall comment for above variables:
//
//		these variables should be inside the model package because the controller
//		package shouldn't need to know how big of a board size it needs to make or
//		how many number of heroes the board would have
//


	public Controller(){
		board = new Board();
		TILE_SIZE = board.getTileSize();
		WIDTH = board.getWidth();
		HEIGHT = board.getHeight();
		tileArray = new TileView[WIDTH][HEIGHT];
		heroArray = new ArrayList();
		tileGroup = createTiles();
		heroGroup = createHeros();

		gameBoard = new BoardView(board.getWidth(), board.getHeight(), board.getTileSize(), tileGroup, heroGroup);

	}


	private Group createTiles(){
		Group group = new Group();
		for(int x = 0; x < WIDTH; x++){
			for(int y = 0; y < HEIGHT; y++){
				TileView tileView = new TileView(x, y, new Tile(TILE_SIZE).getSideSize());

				tileView.setOnMouseClicked(e ->{
					if(tileView.isReady()){
						for(int i = 0; i < heroArray.size(); i++){
							if(heroArray.get(i).isSelected()){
								heroArray.get(i).move(tileView.getLocX(), tileView.getLocY());
							}
						}
					}
					clean();
				});

				tileArray[x][y] = tileView;

				group.getChildren().add(tileView);
			}
		}
		return group;
	}


	private Group createHeros(){
		Group group = new Group();
		ArrayList<Hero> r = new ArrayList();
		r.add(new Warrior(WIDTH, HEIGHT, PlayerType.BLUE));
		r.add(new Warrior(WIDTH, HEIGHT, PlayerType.RED));

		r.add(new Support(WIDTH, HEIGHT, PlayerType.BLUE));
		r.add(new Support(WIDTH, HEIGHT, PlayerType.RED));

		r.add(new Ranger(WIDTH, HEIGHT, PlayerType.BLUE));
		r.add(new Ranger(WIDTH, HEIGHT, PlayerType.RED));

		for(Hero a : r){
			HeroView heroView = new HeroView(a.getStartX(), a.getStartY(),a.getPlayerType(), a.getRoleType(), TILE_SIZE);
			heroArray.add(heroView);



			heroView.setOnMouseClicked(e ->{
				a.move(heroView.getLocX(), heroView.getLocY());

				for(int i = 0; i < a.getValidX().length; i++){
					showValidTiles(tileArray, a.getValidX()[i], a.getValidY()[i]);
				}
			});
			group.getChildren().add(heroView);
		}

		return group;
	}




//	private Group createHeros1(){
//		Group group = new Group();
//
//		Hero h = new Warrior(WIDTH, HEIGHT);
//
//		int x = h.getStartX();
//		int y = h.getStartY();
//
//		HeroView h1 = new HeroView(x, y, PlayerType.BLUE, h.getRoleType());
//		heroArray.add(h1);
//		//tileArray[x][y].setHero(h1);
//
//		h1.setOnMouseClicked(e ->{
//			h.move(h1.getLocX(), h1.getLocY());
//
//			for(int i = 0; i < h.getValidX().length; i++){
//				showValidTiles(tileArray, h.getValidX()[i], h.getValidY()[i]);
//			}
//
//		});
//
//
//		Hero sss = new Support(WIDTH, HEIGHT);
//
//		int sx = sss.getStartX();
//		int sy = sss.getStartY();
//
//		HeroView h2 = new HeroView(sx, sy, PlayerType.RED, sss.getRoleType());
//		heroArray.add(h2);
//		//tileArray[sx][sy].setHero(h2);
//
//		h2.setOnMouseClicked(e ->{
//			sss.move(h2.getLocX(), h2.getLocY());
//			for(int i = 0; i < sss.getValidX().length; i++){
//				showValidTiles(tileArray, sss.getValidX()[i], sss.getValidY()[i]);
//			}
//		});
//
//
//		group.getChildren().add(h1);
//		group.getChildren().add(h2);
//
//		return group;
//	}




	private void showValidTiles(TileView[][] tile, int x, int y){
		tile[x][y].setFill(Color.GREEN);
		tile[x][y].setReady(true);
	}

	private void clean(){
		for(int x = 0; x < WIDTH; x++){
			for(int y = 0; y < HEIGHT; y++){
				tileArray[x][y].setDefault();
			}
		}

		for(int i = 0; i < heroArray.size(); i++){
			heroArray.get(i).setDefault();
		}
	}


	public BoardView getGameBoard(){
		return gameBoard;
	}

}
