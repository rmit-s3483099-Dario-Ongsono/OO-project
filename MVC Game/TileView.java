package gameView;

import gameModel.Tile;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class TileView extends Rectangle{

	private HeroView hero;
	private boolean ready;
	private int x;
	private int y;
	/**
	 * constructor for initial the tile view with 3 parameters x, y, tileSize
	 * @Requires ("x>=0")
	 * @Requires ("h>=0")
	 * @Requires ("tileSize>=0")
	 */
	public TileView(int x, int y, int tileSize){
		super(tileSize, tileSize);
		this.x = x;
		this.y = y;
		this.ready = false;
		this.relocate(x * tileSize, y * tileSize);
		this.setFill(Color.valueOf("#feb"));
		this.setStroke(Color.BLACK);
	}

	/**
	 * set the hero to the view 
	 * @Requires ("hero != null")
	 */
	public void setHero(HeroView hero){
		this.hero = hero;
	}

	public boolean hasHero(){
		return hero != null;
	}

	public HeroView getHero(){
		return hero;
	}

	public void setReady(boolean ready){
		this.ready = ready;
	}

	public boolean isReady(){
		return ready;
	}

	public int getLocX(){
		return x;
	}
	public int getLocY(){
		return y;
	}
	
	public void changeColor() {
		this.setFill(Color.GREEN);
		this.ready = true;

	}

	public void setDefault(){
		this.setFill(Color.valueOf("#feb"));
		this.ready = false;
	}




}
