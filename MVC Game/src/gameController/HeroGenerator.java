package gameController;
/**
 * 
 */
import java.util.ArrayList;

import gameModel.Hero;
import gameModel.PlayerType;
import gameModel.Ranger;
import gameModel.Support;
import gameModel.Warrior;
import gameView.HeroView;
import gameView.TileView;
import javafx.scene.Group;
import javafx.scene.paint.Color;

public class HeroGenerator {
//	private Group heroGroup;
	private int width, height, tilesize;
//	private PlayerType playT;
//	private HeroView heroView;

//	private ArrayList<Hero> heros = new ArrayList<Hero>();


	public HeroGenerator(int width, int height, int tilesize) {
		this.width = width;
		this.height = height;
		this.tilesize = tilesize;
//		this.playT = playT;
	}
	public Group createHeros(ArrayList<HeroView> heroArray,TileView[][] tileArray){
		Group group = new Group();
		ArrayList<Hero> r = new ArrayList<Hero>();
		// list add new warrior that with plyaerType
		r.add(new Warrior(width, height, PlayerType.BLUE));
		r.add(new Warrior(width, height, PlayerType.RED));

		r.add(new Support(width, height, PlayerType.BLUE));
		r.add(new Support(width, height, PlayerType.RED));

		r.add(new Ranger(width, height, PlayerType.BLUE));
		r.add(new Ranger(width, height, PlayerType.RED));
		
		for(Hero a : r){
			HeroView heroView = new HeroView(a.getStartX(), a.getStartY(),a.getPlayerType(), a.getRoleType(), tilesize);
			heroArray.add(heroView);

<<<<<<< HEAD
			// TODO 11/04/2018 17:45 
			// bug is here, when select piece is for each hero in the hero list
			// that's mean 6 pieces can move in one time
=======
			tileArray[a.getStartX()][a.getStartY()].setHero(heroView); // ******* for future developing

			TurnChecker t = new TurnChecker();
>>>>>>> origin/master

			heroView.setOnMouseClicked(e ->{
				if(t.isTurn() && a.getPlayerType() == PlayerType.RED){

					heroView.selecetedChanges();
					a.move(heroView.getLocX(), heroView.getLocY());

					for(int i = 0; i < a.getValidX().length; i++){
						showValidTiles(tileArray, a.getValidX()[i], a.getValidY()[i]);
					}
				}

				if(!t.isTurn() && a.getPlayerType() == PlayerType.BLUE){
					heroView.selecetedChanges();
					a.move(heroView.getLocX(), heroView.getLocY());

<<<<<<< HEAD
				for(int i = 0; i < a.getValidX().length; i++){
					// find all the valid tiles of the selected piece 
					showValidTiles(tileArray, a.getValidX()[i], a.getValidY()[i]);
=======
					for(int i = 0; i < a.getValidX().length; i++){
						showValidTiles(tileArray, a.getValidX()[i], a.getValidY()[i]);
					}
>>>>>>> origin/master
				}


			});
			group.getChildren().add(heroView);
		}

		return group;
	}

	private void showValidTiles(TileView[][] tile, int x, int y){
		tile[x][y].changeColor(); // call the method that change the special tiles.
	}
}
