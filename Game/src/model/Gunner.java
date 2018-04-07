package model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import view.Board;

public class Gunner extends Role implements Capture{

	private Shape shape;

	public Gunner(PlayerType p, RoleType r, int x, int y) {
		super(p, r, x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void capture() {
		// TODO Auto-generated method stub

	}

	@Override
	public void drawShape(PlayerType p) {
//		shape = new Shape();
//
//		shape.setFill(p == PlayerType.BLUE? Color.BLUE:Color.RED);
//
//		shape.setStrokeWidth(Board.TILE_SIZE * 0.03);
//		shape.setStroke(Color.BLACK);
//
//		shape.setTranslateX((Board.TILE_SIZE - Board.TILE_SIZE * 0.3125 * 2 ) / 2);
//		shape.setTranslateY((Board.TILE_SIZE - Board.TILE_SIZE * 0.26 * 2) / 2 + Board.TILE_SIZE * 0.07);
//		getChildren().addAll(shape);

	}

}
