package gameModel;


public class Warrior extends Hero implements Capture{
	private int move = 2;
	private int width;
	private int height;

<<<<<<< HEAD
	public Warrior(int w, int h, PlayerType p) {
		super.setStartX((p == PlayerType.BLUE ? 0 : w - 1));
		super.setStartY(3);
		super.setRoleType(RoleType.WARRIOR);
		super.setPlayerType(p);
=======
<<<<<<< HEAD
	public final int SMOVE; //Straight Line move
	public final int DMOVE; //Diagonal Line move 
	
	public Warrior(int x, int y, PlayerType p, RoleType r) {
		super(x, y, p, r);
		SMOVE = 1;
		DMOVE = 0;
=======
	public Warrior(int width, int heigh) {
		super.setStartX(1);
		super.setStartY(0);
		super.setRoleType(RoleType.WARRIOR);
>>>>>>> 63dfb03f5d15102d8fae25b61622d3b435a43cb9
>>>>>>> 39b141e3f8115f47cb2d6aa67eca5b18aeaad5f5

		this.width = w;
		this.height = h;
	}

	@Override
	public void capture() {

	}

	@Override
	public void move(int curX, int curY) {
		super.validX = new int[4];
		super.validY = new int[4];

		validX[0] = (curX + move < width ? curX + move : curX);
		validY[0] = curY;

		validX[1] = curX;
		validY[1] = (curY + move < height ? curY + move : curY);

		validX[2] = (curX - move >= 0 ? curX - move : curX);
		validY[2] = curY;

		validX[3] = curX;
		validY[3] = (curY - move >= 0 ? curY - move : curY);

	}

}
