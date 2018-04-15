package gameModel;


public interface Move {
	/**
	 * interface for move hero
	 * @Ensures ("x>=0")
	 * @Ensures ("y>+0")
	 */
	abstract void move(int x, int y);
}
