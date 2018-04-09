package gameView;

import gameController.Controller;

import gameModel.*;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;

public class HeroView extends StackPane{
	private Shape shape;
	private Polygon triangle;
	private Hero hero;

	public HeroView(int x, int y, PlayerType p, RoleType r){
		relocate(x * Controller.TILE_SIZE, y * Controller.TILE_SIZE);
		drawShape(p);

		createHero(x, y, p, r);
	}


	private void drawShape(PlayerType p){
		shape = new Ellipse(Controller.TILE_SIZE * 0.3125, Controller.TILE_SIZE * 0.26);

		shape.setFill(p == PlayerType.BLUE? Color.BLUE:Color.RED);

		shape.setStrokeWidth(Controller.TILE_SIZE * 0.05);
		shape.setStroke(Color.BLACK);

		shape.setTranslateX((Controller.TILE_SIZE - Controller.TILE_SIZE * 0.3125 * 2 ) / 2);
		shape.setTranslateY((Controller.TILE_SIZE - Controller.TILE_SIZE * 0.26 * 2) / 2 + Controller.TILE_SIZE * 0.07);
		getChildren().addAll(shape);
	}
	
	private void drawTriangle(PlayerType p) {
		triangle = new Polygon();
		
	}
	

	private void createHero(int x, int y, PlayerType p, RoleType r){
		if(r == RoleType.WARRIOR)
			hero = new Warrior(x, y, p, r);
		else if(r == RoleType.GUNNER)
			; //TODO
		else
			; //TODO
	}

	public Hero getHero(){
		return hero;
	}

	public void pressed(){
		shape.setStroke(Color.WHITE);
		hero.selectHero(true);
	}

	public void move(){
		this.relocate(hero.getLocationX() * Controller.TILE_SIZE , hero.getLocationY() * Controller.TILE_SIZE);
		hero.selectHero(false);
		shape.setStroke(Color.BLACK);
	}
}
