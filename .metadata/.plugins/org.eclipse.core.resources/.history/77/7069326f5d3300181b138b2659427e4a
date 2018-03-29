package model;

import controller.Location;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import view.Window;




public class TestRole extends HeroTest{
	private int x, y;
	private int oldX, oldY;
	private Ellipse bg;
	private boolean heroType;
	private int dx = 1; //testing sample for indicating type of piece. change it to real type late

	public TestRole(boolean type, int x, int y, int d){

		move(x, y);
		heroType = type;
		dx = d;
		this.x = x;
		this.y = y;
		bg = new Ellipse(Window.SQUARE_SIZE * 0.3125, Window.SQUARE_SIZE * 0.26);

		if(type)
			bg.setFill(Color.BLUE);
		else
			bg.setFill(Color.RED);


		bg.setStroke(Color.BLACK);
		bg.setStrokeWidth(Window.SQUARE_SIZE * 0.03);

		bg.setTranslateX((Window.SQUARE_SIZE - Window.SQUARE_SIZE * 0.3125 * 2) / 2);
		bg.setTranslateY((Window.SQUARE_SIZE - Window.SQUARE_SIZE * 0.26 * 2) / 2 + Window.SQUARE_SIZE * 0.07);

		getChildren().addAll(bg);

		setOnMousePressed(e ->{
			bg.setStroke(Color.WHITE);
		});
	}

	@Override
	public void move(int x, int y) {
		oldX = x * Window.SQUARE_SIZE;
        oldY = y * Window.SQUARE_SIZE;
        relocate(oldX, oldY);

	}

	@Override
	public void abortMove() {


	}

	public boolean getType(){
		return heroType;
	}


	public Ellipse getBg(){
		return bg;
	}

	public int getDX(){
		return dx;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}




}
