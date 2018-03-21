package view;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import model.TestRole;

public class Square extends Rectangle{
	private int newX, newY;
	private TestRole hero;

	public void setPiece(TestRole hero){
		this.hero = hero;
	}

	public boolean hasPiece(){
		return hero != null;
	}
	public TestRole getPiece(){
		return hero;
	}

	public Square(int x, int y){
		setWidth(Window.SQUARE_SIZE);
		setHeight(Window.SQUARE_SIZE);
		newX = x * Window.SQUARE_SIZE;
		newY = y * Window.SQUARE_SIZE;
		relocate(newX, newY);

		setFill(Color.valueOf("#feb"));
		setStroke(Color.valueOf("Black"));

		setOnMouseEntered(e ->{
			setFill(Color.valueOf("White"));
		});
		setOnMouseExited(e ->{
			setFill(Color.valueOf("#feb"));
		});

		setOnMouseClicked(e ->{
			if(Location.pieceSelected() != null){
				setFill(Color.valueOf("Red"));
				Location.movePiece(newX, newY);
			}
		});
	}
}
