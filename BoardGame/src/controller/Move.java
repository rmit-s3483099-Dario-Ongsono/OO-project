package controller;

import model.TestRole;
import view.Square;

/*
 * same design logic with Location.java
 *
 * function of class:
 * 1) highlight squares that pieces can move to
 * 2) move pieces to a selected square
 * 3) deny a move when a selected piece cannot move to
 *
 * late function:
 * 1) remove a piece from the board
 *
 */
public class Move{
	private TestRole roleSelected;
	private Square[][] moveBoard;

	public void detectValidSquare(TestRole hero, Square[][] board){
		roleSelected  = hero;
		moveBoard = board;




	}

	public void moveMethod(TestRole hero){


		switch(hero.getPieceType()){
		case "Gunner":

			break;
		case "Support":

			break;
		}
	}


}