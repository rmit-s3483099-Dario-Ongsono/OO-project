package gameView;

import gameModel.Tile;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class TileView extends Rectangle{

	private Tile tile;

//	public TileView(int x, int y, int tileSize){
//		super(tileSize, tileSize);
//		this.relocate(x * tileSize, y * tileSize);
//		this.setFill(Color.valueOf("#feb"));
//		this.setStroke(Color.BLACK);
//
//		tile = new Tile(x, y);
//	}

	public TileView(Tile tile){
		super(tile.getSideSize(), tile.getSideSize());
		this.tile = tile;
		this.relocate(tile.getX() * tile.getSideSize(), tile.getY() * tile.getSideSize());
		this.setFill(Color.valueOf("#feb"));
		this.setStroke(Color.BLACK);
	}


	public Tile getTile(){
		return tile;
	}
}
