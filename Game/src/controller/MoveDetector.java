package controller;

import model.Role;
import model.Tile;

public class MoveDetector extends Detector{


	public MoveDetector(Role hero, Tile[][] tile){
		super(hero, tile);
	}

	public void moveTo(int x, int y){
		if(super.getTile()[x][y].isReady()){
			super.getRoleSelected().setInitX(x);
			super.getRoleSelected().setInitY(y);
			super.getRoleSelected().move(x, y);
		}
	}



}
