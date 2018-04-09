package gameController;



import java.util.ArrayList;

import gameModel.*;
import gameView.*;
import javafx.scene.Group;
import javafx.scene.paint.Color;

public class Controller {
	private Board gameBoard;
	private TileView tileView;
	private Group tileGroup;
	private Group heroGroup;
	private TileView[][] tileArray;
	private ArrayList<HeroView> heroArray;

	public static final int TILE_SIZE = 50; //This should be in Model package in Board class, - Dario
										   //gameView package should have BoardView class instead - Dario

	public static final int WIDTH = 12;   //this too - Dario
	public static final int HEIGHT = 14;  //this too - Dario

	//private static final int HERO_NUM = 6; //This variable maybe should be in a class of its own (maybe) - Dario

//	Overall comment for above variables:
//
//		these variables should be inside the model package because the controller
//		package shouldn't need to know how big of a board size it needs to make or
//		how many number of heroes the board would have
//


	public Controller(){
		tileArray = new TileView[WIDTH][HEIGHT];
		heroArray = new ArrayList();
		tileGroup = createTilesView();
		//heroGroup = createHerosView();
		createHeroModel();
		gameBoard = new Board(TILE_SIZE, WIDTH, HEIGHT, tileGroup, heroGroup);

	}



	public Group createTilesView(){
		Group tileGroup = new Group();

		for(int x = 0; x < WIDTH; x++){
			for(int y = 0; y < HEIGHT; y++){
				TileView tileView = new TileView(x, y, TILE_SIZE);

				addTileEvents(tileView);

				tileArray[x][y] = tileView;

				tileGroup.getChildren().add(tileView);
			}
		}
		return tileGroup;
	}

	/*****test code for MVC******/

	public void createHeroModel(){
		heroGroup = new Group();
		Hero h = new Warrior(2, 3, PlayerType.BLUE, RoleType.WARRIOR);
		HeroView hero = new HeroView(h);

		heroArray.add(hero);
		tileArray[2][3].getTile().setHero(h);
		addHeroEvents(hero);
		heroGroup.getChildren().add(hero);
	}

	/*************/



	public Group createHerosView(){
		int redY = 1;
		int blueY = HEIGHT - 1;
		Group heroGroup = new Group();
		HeroView hero;



		hero = new HeroView(2, blueY, PlayerType.BLUE, RoleType.WARRIOR);
		heroArray.add(hero);
		tileArray[2][blueY].getTile().setHero(hero.getHero()); //may change hero.getHero() to heroView
		addHeroEvents(hero);
		heroGroup.getChildren().add(hero);


		hero = new HeroView(5, blueY, PlayerType.BLUE, RoleType.SUPPORT);
		heroArray.add(hero);
		tileArray[5][blueY].getTile().setHero(hero.getHero()); //may change hero.getHero() to heroView
		addHeroEvents(hero);
		heroGroup.getChildren().add(hero);



		hero = new HeroView(7, blueY, PlayerType.BLUE, RoleType.GUNNER);
		heroArray.add(hero);
		tileArray[7][blueY].getTile().setHero(hero.getHero()); //may change hero.getHero() to heroView
		addHeroEvents(hero);
		heroGroup.getChildren().add(hero);

		hero = new HeroView(2, redY, PlayerType.RED, RoleType.WARRIOR);
		heroArray.add(hero);
		tileArray[2][redY].getTile().setHero(hero.getHero()); //may change hero.getHero() to heroView
		addHeroEvents(hero);
		heroGroup.getChildren().add(hero);


		hero = new HeroView(5, redY, PlayerType.RED, RoleType.SUPPORT);
		heroArray.add(hero);
		tileArray[5][redY].getTile().setHero(hero.getHero()); //may change hero.getHero() to heroView
		addHeroEvents(hero);
		heroGroup.getChildren().add(hero);


		hero = new HeroView(7, redY, PlayerType.RED, RoleType.GUNNER);
		heroArray.add(hero);
		tileArray[7][redY].getTile().setHero(hero.getHero()); //may change hero.getHero() to heroView
		addHeroEvents(hero);
		heroGroup.getChildren().add(hero);

		return heroGroup;
	}














	private void addHeroEvents(HeroView hero){
		hero.setOnMousePressed(e ->{
			hero.pressed(); // change stroke color to white and turn boolean select to true
			ValidTileDetector validTile = new ValidTileDetector(tileArray, hero);
		});
	}


/***************need to fix the point from hero view to hero model****************/
	private void addTileEvents(TileView tileView){
		tileView.setOnMouseClicked(e ->{
			HeroView selectedHero = findSelectedHero(heroArray);
			if(tileView.getTile().isReady()){
				int x = tileView.getTile().getX();
				int y = tileView.getTile().getY();
				int oldx = selectedHero.getHero().getLocationX();
				int oldy = selectedHero.getHero().getLocationY();
				selectedHero.getHero().setLocationX(x);
				selectedHero.getHero().setLocationY(y);
				selectedHero.move();
				tileView.getTile().setHero(selectedHero.getHero());
				tileArray[oldx][oldy].getTile().setHero(null);
				tileClean();
			}

		});
	}



	/***************need fix the point of hero from hero view to hero model*********************/
	private HeroView findSelectedHero(ArrayList<HeroView> heroArray){
		HeroView selectedHero;
		for(int i = 0; i < heroArray.size(); i++){
			if(heroArray.get(i).getHero().isSelected()){
				return selectedHero = heroArray.get(i);
			}
		}
		return selectedHero = null;
	}



	private void tileClean(){
		for(int i = 0; i < WIDTH; i++){
			for(int j = 0; j < HEIGHT; j++){
				tileArray[i][j].getTile().setReady(false);
				tileArray[i][j].setFill(Color.valueOf("#feb"));
			}
		}
	}



	public Board getGameBoard(){
		return gameBoard;
	}

}
