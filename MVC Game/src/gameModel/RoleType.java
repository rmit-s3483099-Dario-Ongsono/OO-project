package gameModel;

public enum RoleType {
	WARRIOR(1, 0), SUPPORT(2, 2), GUNNER(4, 0), TEST(1, 0);

	public final int SMOVE; //Straight Line move
	public final int DMOVE; //Diagonal Line move
	RoleType(int x, int y){
		this.SMOVE = x;
		this.DMOVE = y;
	}

}
