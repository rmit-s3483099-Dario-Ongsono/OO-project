package gameView;

import gameModel.Tile;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class TileView extends Rectangle{

	private Tile tile;

	public TileView(int x, int y, int tileSize){
		super(tileSize, tileSize);
		this.relocate(x * tileSize, y * tileSize);
		this.setFill(Color.valueOf("#feb"));
		this.setStroke(Color.BLACK);

		tile = new Tile(x, y);
	}

	public Tile getTile(){
		return tile;
	}
}
