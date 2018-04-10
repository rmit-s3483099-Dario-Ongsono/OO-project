package gameModel;

public class Tile {

	private int x;
	private int y;
	private int sideSize;
	private Hero hero;
	private boolean ready;

	public Tile(int size, int x, int y){
		this.x = x;
		this.y = y;
		this.sideSize = size;
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

	public int getSideSize(){
		return sideSize;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}



}
