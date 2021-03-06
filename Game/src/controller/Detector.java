package controller;

import model.Role;
import model.Tile;

public abstract class Detector {
	private Role heroSelected;
	private Tile[][] tile;

	public Detector(Role hero, Tile[][] tile){
		this.heroSelected = hero;
		this.tile = tile;
	}

	public Role getRoleSelected(){
		return heroSelected;
	}

	public Tile[][] getTile(){
		return tile;
	}
}
