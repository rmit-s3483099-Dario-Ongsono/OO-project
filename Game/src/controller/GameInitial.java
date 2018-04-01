package controller;

import javafx.scene.Group;
import model.Tile;
import view.Board;

public class GameInitial {

	private Group tileGroup = new Group();
	private Group heroGroup = new Group();

	private Tile[][] tileArray = new Tile[Board.WIDTH][Board.HEIGHT];

	public Group tileInitialize(){
		for(int y = 0 ; y < Board.HEIGHT; y++){
			for(int x = 0; x < Board.WIDTH; x++){
				Tile tile = new Tile(x, y);
				tileGroup.getChildren().add(tile);
			}
		}
		return tileGroup;
	}

	public Group heroInitialize(){

		return heroGroup;
	}



}