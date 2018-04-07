package gameModel;

public class Tile {
	private int x;
	private int y;
	private Hero hero;
	private boolean ready;

	public Tile(int x, int y){
		this.x = x;
		this.y = y;
	}

	public void setHero(Hero hero){
		this.hero = hero;
	}

	public boolean hasHero(){
		return hero != null;
	}

	public void setReady(boolean ready){
		this.ready = ready;
	}

	public boolean isReady(){
		return ready;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

}
