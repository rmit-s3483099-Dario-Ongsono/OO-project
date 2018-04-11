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

<<<<<<< HEAD
		r.add(new Support(WIDTH, HEIGHT, PlayerType.BLUE));
		r.add(new Support(WIDTH, HEIGHT, PlayerType.RED));
=======
<<<<<<< HEAD
		heroGroup = new Group();
		Hero h = new Warrior(0, 0, PlayerType.BLUE, RoleType.WARRIOR);
		
		HeroView hero = new HeroView(h);

		heroArray.add(hero);
		tileArray[0][0].getTile().setHero(h);
		addHeroEvents(hero);
		heroGroup.getChildren().add(hero);


		h = new Support(1, 1, PlayerType.RED, RoleType.SUPPORT);
		hero = new HeroView(h);

		heroArray.add(hero);
		tileArray[1][1].getTile().setHero(h);
		addHeroEvents(hero);
		heroGroup.getChildren().add(hero);

		// set the Blue player's minions in the col 0 and the Red Player's minions in the col 11
//		int LocPlayerB = 0, LocPlayerR = 11;
//		// for each play need 3 minions
//		for(int i = 0; i< HEIGHT;i = i++) {
//			// late change i to random
//			Hero h1 = null;
//			Hero h2 = null;
//			HeroView heroV1 = null;
//			HeroView heroV2 = null;
//
//			if(i == 2) {
//				 h1 = new Warrior(LocPlayerB, i, PlayerType.BLUE, RoleType.WARRIOR);
//				 heroV1 = new HeroView(h1);
//				 h2 = new Warrior(LocPlayerR, i, PlayerType.RED, RoleType.WARRIOR);
//				 heroV2 = new HeroView(h2);
//			}
//
//			if(i == 5) {
//				h1 = new Support(LocPlayerB, i, PlayerType.BLUE, RoleType.SUPPORT);
//				heroV1 = new HeroView(h1);
//				h2 = new Support(LocPlayerR, i, PlayerType.RED, RoleType.SUPPORT);
//				heroV2 = new HeroView(h2);
//			}
//
//			if(i == 8) {
//				h1 = new Gunner(LocPlayerB, i, PlayerType.BLUE, RoleType.GUNNER);
//				heroV1 = new HeroView(h1);
//				h2 = new Gunner(LocPlayerR, i, PlayerType.RED, RoleType.GUNNER);
//				heroV2 = new HeroView(h2);
//			}
//
//			if(h1 != null && h2 != null) {
//				if(h1.getPlayerType() == PlayerType.BLUE)
//					tileArray[LocPlayerB][i].getTile().setHero(h1);
//				if(h2.getPlayerType() == PlayerType.RED)
//					tileArray[LocPlayerR][i].getTile().setHero(h2);
//			}
//
//			if(heroV1 != null && heroV2 != null) {
//				heroArray.add(heroV1);
//				heroArray.add(heroV2);
//				addHeroEvents(heroV1);
//				addHeroEvents(heroV2);
//				heroGroup.getChildren().add(heroV1);
//				heroGroup.getChildren().add(heroV2);
//			}
//
//		}

	}

	/*************/



//	public Group createHerosView(){
//		int redY = 1;
//		int blueY = HEIGHT - 1;
//		Group heroGroup = new Group();
//		HeroView hero;
//
//
//
//		hero = new HeroView(2, blueY, PlayerType.BLUE, RoleType.WARRIOR);
//		heroArray.add(hero);
//		tileArray[2][blueY].getTile().setHero(hero.getHero()); //may change hero.getHero() to heroView
//		addHeroEvents(hero);
//		heroGroup.getChildren().add(hero);
//
//
//		hero = new HeroView(5, blueY, PlayerType.BLUE, RoleType.SUPPORT);
//		heroArray.add(hero);
//		tileArray[5][blueY].getTile().setHero(hero.getHero()); //may change hero.getHero() to heroView
//		addHeroEvents(hero);
//		heroGroup.getChildren().add(hero);
//
//
//
//		hero = new HeroView(7, blueY, PlayerType.BLUE, RoleType.GUNNER);
//		heroArray.add(hero);
//		tileArray[7][blueY].getTile().setHero(hero.getHero()); //may change hero.getHero() to heroView
//		addHeroEvents(hero);
//		heroGroup.getChildren().add(hero);
//
//		hero = new HeroView(2, redY, PlayerType.RED, RoleType.WARRIOR);
//		heroArray.add(hero);
//		tileArray[2][redY].getTile().setHero(hero.getHero()); //may change hero.getHero() to heroView
//		addHeroEvents(hero);
//		heroGroup.getChildren().add(hero);
//
//
//		hero = new HeroView(5, redY, PlayerType.RED, RoleType.SUPPORT);
//		heroArray.add(hero);
//		tileArray[5][redY].getTile().setHero(hero.getHero()); //may change hero.getHero() to heroView
//		addHeroEvents(hero);
//		heroGroup.getChildren().add(hero);
//
//
//		hero = new HeroView(7, redY, PlayerType.RED, RoleType.GUNNER);
//		heroArray.add(hero);
//		tileArray[7][redY].getTile().setHero(hero.getHero()); //may change hero.getHero() to heroView
//		addHeroEvents(hero);
//		heroGroup.getChildren().add(hero);
//
//		return heroGroup;
//	}

=======
		Hero h = new Warrior(WIDTH, HEIGHT);
>>>>>>> 63dfb03f5d15102d8fae25b61622d3b435a43cb9
>>>>>>> 39b141e3f8115f47cb2d6aa67eca5b18aeaad5f5

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
