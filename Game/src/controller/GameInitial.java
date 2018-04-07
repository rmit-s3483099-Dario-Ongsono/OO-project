package controller;

import javafx.scene.Group;
import model.PlayerType;
import model.Role;
import model.RoleType;
import model.Tile;
import model.Warrior;
import view.Board;

public class GameInitial {

	private Group tileGroup = new Group();
	private Group heroGroup = new Group();

	private Tile[][] tileArray = new Tile[Board.WIDTH][Board.HEIGHT];

	private Detector detector;

	public Group tileInitialize(){
		for(int y = 0 ; y < Board.HEIGHT; y++){
			for(int x = 0; x < Board.WIDTH; x++){
				Tile tile = new Tile(x, y);
				tileArray[x][y] = tile;
				tileGroup.getChildren().add(tile);

				tile.setOnMouseClicked(e ->{
					((TileDetector) detector).moveTo(tile.getTileX(), tile.getTileY());
				});
			}
		}
		return tileGroup;
	}

	public Group heroInitialize(){


			Role hero = new Warrior(PlayerType.RED, RoleType.WARRIOR, 4, 2);
			//TOD
			// set on action here;
			hero.setOnMouseClicked(e ->{

				detector = new TileDetector(hero, getTileArray());
				((TileDetector) detector).validTile();

			});

			getTileArray()[4][2].heroIn(hero);


			heroGroup.getChildren().add(hero);

		return heroGroup;
	}

	public Tile[][] getTileArray(){
		return tileArray;
	}

}
