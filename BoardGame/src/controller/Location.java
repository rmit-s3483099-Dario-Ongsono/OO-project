package controller;

import javafx.scene.paint.Color;
import model.TestRole;

public class Location {
	private static TestRole h;
	private static int turn = 1;

	public static void selectPiece(TestRole hero){
		h = hero;
		turn += 1;
	}

	
	public static void movePiece(int x, int y){
		h.relocate(x, y);
		h.getBg().setStroke(Color.BLACK);
		h = null;
	}
	
	public static TestRole pieceSelected(){
		return h;
	}
	
	public static int getTurn(){
		return turn;
	}
}
