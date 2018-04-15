package gameView;

import gameModel.*;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;

public class HeroView extends StackPane{
	private Shape shape;

	private int x;
	private int y;
	private boolean alive;
	private boolean selected;
	private int size;
	private PlayerType p;
	/**
	 * initial hero view with the parameters x, y, p, r, s, size
	 * @Requires ("x>=0")
	 * @Requires ("y>=0")
	 * @Requires ("p == RED || p == BLUE")
	 * @Requires ("r == WARRIOR || r == RANGER || r == SUPPOER")
	 * @Requires ("size>=0")
	 */
	public HeroView(int x, int y, PlayerType p, RoleType r, int size){
		relocate(x * size, y * size);
		this.size = size;
		this.x = x;
		this.y = y;
		drawShape(p);
		this.alive = true;
		this.p = p;

	}
	
	public void selecetedChanges(){
		shape.setStroke(Color.WHITE);
		this.selected = true;
	}
	/**
	 * draw the hero for the player
	 * @Requires ("p == RED || p == BLUE")
	 */
	private void drawShape(PlayerType p){
		shape = new Ellipse(size * 0.3125, size * 0.26);

		shape.setFill(p == PlayerType.BLUE? Color.BLUE:Color.RED);

		shape.setStrokeWidth(size * 0.05);
		shape.setStroke(Color.BLACK);

		shape.setTranslateX((size - size * 0.3125 * 2 ) / 2);
		shape.setTranslateY((size - size * 0.26 * 2) / 2 + size * 0.07);
		getChildren().addAll(shape);
	}
	/**
	 * return Player type
	 * @Ensures (""p == RED || p == BLUE")
	 */
	public PlayerType getPlayerType(){
		return p;
	}

	/**
	 * move hero and relocate it
	 * @Requires ("x>=0")
	 * @Requires ("y>+0")
	 */
	public void move(int x, int y){
		this.x = x;
		this.y = y;
		this.relocate(x * size , y * size );
		
	}
	/**
	 * return the action that if the hero is selected
	 * @Ensures ("selected == true || selected == false")
	 */
	public boolean isSelected(){
		return selected;
	}
	/**
	 * 
	 * 
	 */
	public void setDefault(){
		shape.setStroke(Color.BLACK);
		this.selected = false;
	}
	/**
	 * set the hero status with the input life
	 * @Requires ("life == true || life == false")
	 */
	public void setlife(boolean life){
		this.alive = life;
	}
	/**
	 * return the status that if the hero is alive
	 * @Ensures ("alive == true || alive == false")
	 */
	public boolean isAlive(){
		return alive;
	}
	/**
	 * return the integer that for current location
	 * @Ensures ("x>=0")
	 */
	public int getLocX(){
		return x;
	}
	/**
	 * return the integer that for current location
	 * @Ensures ("y>=0")
	 */
	public int getLocY(){
		return y;
	}
}
