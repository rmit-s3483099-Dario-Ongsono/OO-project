package gameController;



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
	private HeroView[] heroArray;

	public static final int TILE_SIZE = 50; //This should be in Model package in Board class, - Dario
										   //gameView package should have BoardView class instead - Dario

	public static final int WIDTH = 12;   //this too - Dario
	public static final int HEIGHT = 14;  //this too - Dario

	private static final int HERO_NUM = 1; //This variable maybe should be in a class of its own (maybe) - Dario

//	Overall comment for above variables:
//
//		these variables should be inside the model package because the controller
//		package shouldn't need to know how big of a board size it needs to make or
//		how many number of heroes the board would have
//


	public Controller(){
		tileArray = new TileView[WIDTH][HEIGHT];
		heroArray = new HeroView[HERO_NUM];
		tileGroup = createTilesView();
		heroGroup = createHerosView();
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



	public Group createHerosView(){
		Group heroGroup = new Group();
		HeroView hero = new HeroView(3, 3, PlayerType.BLUE, RoleType.WARRIOR);
		heroArray[0] = hero;
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
			ValidTileDetector validTile = new ValidTileDetector(tileArray, hero);
		});
	}



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




	private HeroView findSelectedHero(HeroView[] heroArray){
		HeroView selectedHero;
		for(int i = 0; i < heroArray.length; i++){
			if(heroArray[i].getHero().isSelected()){
				return selectedHero = heroArray[i];
			}
		}
		return selectedHero = null;
	}



	private void tileClean(){
		for(int i = 0; i < tileArray.length; i++){
			for(int j = 0; j < tileArray.length; j++){
				tileArray[i][j].getTile().setReady(false);
				tileArray[i][j].setFill(Color.valueOf("#feb"));
			}
		}
	}



	public Board getGameBoard(){
		return gameBoard;
	}

}
