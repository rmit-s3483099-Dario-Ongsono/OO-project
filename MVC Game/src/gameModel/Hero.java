package gameModel;

public abstract class Hero implements Move{
	private boolean alive;
	private PlayerType pType;
	private RoleType rType;
	private boolean selected;
	private int locationX, locationY;

	public Hero(int x, int y, PlayerType p, RoleType r ){
		this.alive = true;
		this.pType = p;
		this.rType = r;
		this.locationX = x;
		this.locationY = y;

	}

	public PlayerType getPlayerType(){
		return pType;
	}

	public RoleType getRoleType(){
		return rType;
	}

	public boolean isAlive(){
		return alive;
	}

	public void setLife(boolean life){
		this.alive = life;
	}

	public int getLocationX(){
		return locationX;
	}

	public int getLocationY(){
		return locationY;
	}

	public void setLocationX(int x){
		this.locationX = x;
	}

	public void setLocationY(int y){
		this.locationY = y;
	}

	public void selectHero(boolean select){
		this.selected = select;
	}

	public boolean isSelected(){
		return selected;
	}
}
