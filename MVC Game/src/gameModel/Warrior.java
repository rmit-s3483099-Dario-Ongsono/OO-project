package gameModel;

public class Warrior extends Hero implements Capture{

	public Warrior(int x, int y, PlayerType p, RoleType r) {
		super(x, y, p, r);

	}

	@Override
	public void move(int x, int y) {
		 this.setLocationX(x);
		 this.setLocationY(y);
	}

	@Override
	public void capture() {

	}

}
