package model;

import javafx.scene.layout.StackPane;
import view.Board;

public abstract class Role extends StackPane implements Move{
	private PlayerType player;
	private RoleType role;
	private int initX, initY;
	private boolean select;

	public Role(PlayerType p, RoleType r, int x, int y){
		this.player = p;
		this.role = r;
		this.select = false;

		this.initX = x;
		this.initY = y;
		eventAction();

	}

	private void eventAction(){
		setOnMousePressed(e ->{
			// TODO

			selected(true);
		});
	}


	public abstract void drawShape(PlayerType p);

	public void selected(boolean s){
		select = s;
	}

	public boolean isSelected(){
		return select;
	}

	public PlayerType getPlayer(){
		return player;
	}

	public RoleType getRole(){
		return role;
	}

	public int getInitX() {
		return initX;
	}

	public void setInitX(int x) {

		this.initX = x;
	}

	public int getInitY() {
		return initY;
	}

	public void setInitY(int y) {
		this.initY = y;
	}


}
