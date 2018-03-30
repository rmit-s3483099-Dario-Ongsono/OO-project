package controller;

import javafx.scene.paint.Color;
import model.TestRole;
import view.Square;
import view.Window;

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
	private static TestRole roleSelected;
	private static Square[][] moveBoard;

	public static void detectValidSquare(TestRole hero, Square[][] board){
		roleSelected  = hero;
		moveBoard = board;
		int x = roleSelected.getX();
		int y = roleSelected.getY();
		squareTest(x, y);
	}

	/*
	 * squareTest method:
	 * this is really stupid method.
	 *
	 * function:
	 * 1) it turns square's color to green
	 * 2) it turns square's attribute to ready,
	 * this means that a selected piece only can move to green square
	 *
	 */
	private static void squareTest(int x, int y){
		switch(roleSelected.getDX()){
		case 1:
			if(x-1 >= 0){
				moveBoard[x-1][y].setFill(Color.GREEN);
				moveBoard[x-1][y].setReady(true);
			}

			if(x + 1 <= Window.WIDTH){
				moveBoard[x+1][y].setFill(Color.GREEN);
				moveBoard[x+1][y].setReady(true);
			}


			if(y - 1 >= 0){
				moveBoard[x][y-1].setFill(Color.GREEN);
				moveBoard[x][y-1].setReady(true);
			}


			if(y + 1 <= Window.HEIGHT){
				moveBoard[x][y+1].setFill(Color.GREEN);
				moveBoard[x][y+1].setReady(true);
			}
			break;
		case 2:
			if(x-2 >= 0){
				moveBoard[x-2][y].setFill(Color.GREEN);
				moveBoard[x-2][y].setReady(true);
			}
			if(x + 2 <= Window.WIDTH){
				moveBoard[x+2][y].setFill(Color.GREEN);
				moveBoard[x+2][y].setReady(true);
			}
			if(y - 2 >= 0){
				moveBoard[x][y-2].setFill(Color.GREEN);
				moveBoard[x][y-2].setReady(true);
			}
			if(y + 2 <= Window.HEIGHT){
				moveBoard[x][y+2].setFill(Color.GREEN);
				moveBoard[x][y+2].setReady(true);
			}
			break;
		case 3:
			if(x-1 >= 0 && y + 1 <= Window.HEIGHT){
				moveBoard[x-1][y + 1].setFill(Color.GREEN);
				moveBoard[x-1][y + 1].setReady(true);
			}
			if(x + 1 <= Window.WIDTH && y - 1 >= 0){
				moveBoard[x+1][y - 1].setFill(Color.GREEN);
				moveBoard[x+1][y - 1].setReady(true);
			}
			if(y - 1 >= 0 && x - 1 >= 0){
				moveBoard[x - 1][y-1].setFill(Color.GREEN);
				moveBoard[x - 1][y-1].setReady(true);
			}
			if(y + 1 <= Window.HEIGHT && x + 1 <= Window.WIDTH){
				moveBoard[x + 1][y+1].setFill(Color.GREEN);
				moveBoard[x + 1][y+1].setReady(true);
			}
			break;
		}
	}

	/*
	 * moveTest:
	 * it will test the attribute of a square that user clicked
	 * if the attribute is ready, then the selected piece can move to
	 */
	public static boolean moveTest(int x, int y){
		boolean result = false;
		if(moveBoard[x][y].isReady()){
			result = true;
		}
		return result;
	}

	/*
	 * clean:
	 * after each move, this method will set all squares to initial status
	 * which means the attribute of square is false and color is "#feb"
	 */
	public static void clean(){
		for(int i = 0; i < moveBoard.length; i++){
			for(int j = 0; j < moveBoard.length; j++){
				moveBoard[i][j].setReady(false);
				moveBoard[i][j].setFill(Color.valueOf("#feb"));
			}
		}
	}
}