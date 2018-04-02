package model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import view.Board;

public class Support extends Role implements Revive{

	public Shape shape;

	public Support(PlayerType p, RoleType r, int x, int y) {
		super(p, r, x, y);

		drawShape(p);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void drawShape(PlayerType p) {
		shape = new Rectangle(Board.TILE_SIZE * 0.3125, Board.TILE_SIZE * 0.26);

		shape.setFill(p == PlayerType.BLUE? Color.BLUE:Color.RED);

		shape.setStrokeWidth(Board.TILE_SIZE * 0.03);
		shape.setStroke(Color.BLACK);

		shape.setTranslateX((Board.TILE_SIZE - Board.TILE_SIZE * 0.3125 * 2 ) / 2);
		shape.setTranslateY((Board.TILE_SIZE - Board.TILE_SIZE * 0.26 * 2) / 2 + Board.TILE_SIZE * 0.07);
		getChildren().addAll(shape);
	}

	@Override
	public void revive() {
		// TODO Auto-generated method stub

	}

}
