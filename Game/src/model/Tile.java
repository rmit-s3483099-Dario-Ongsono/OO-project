package model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import view.Board;

public class Tile extends Rectangle {
	private int newX, newY;
	private Role hero = null;
	private boolean ready;
	private int tileX, tileY;

	public Tile(int x, int y){
		super(Board.TILE_SIZE, Board.TILE_SIZE);
		this.tileX = x;
		this.tileY = y;
		newX = x * Board.TILE_SIZE;
		newY = y * Board.TILE_SIZE;
		this.ready = false;
		createTile();
		eventAction();
	}

	private void eventAction(){
		setOnMouseClicked(e->{
			//TODO
		});
	}

	public void createTile(){
		relocate(newX, newY);
		setFill(Color.valueOf("#feb"));
		setStroke(Color.BLACK);
	}

	public void heroIn(Role r){
		this.hero = r;
	}

	public boolean hasHero(){
		return hero != null;
	}

	public void heroOut(){
		this.hero = null;
	}

	public void setReady(boolean ready){
		this.ready = ready;
	}

	public boolean isReady(){
		return ready;
	}

	public int getTileX() {
		return tileX;
	}

	public int getTileY() {
		return tileY;
	}




}
