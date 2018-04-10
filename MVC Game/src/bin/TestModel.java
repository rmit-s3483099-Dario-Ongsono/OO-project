package bin;

import gameModel.Move;
import gameModel.RoleType;


public class TestModel implements Move{

	 ValidTileDetector valid ;

	 private RoleType r = RoleType.TEST;

//	public TestModel(int x, int y, PlayerType p, RoleType r) {
//		super(x, y, p, r);
//		// TODO Auto-generated constructor stub
//	}

	public TestModel(){

	}

	@Override
	public void move(int x, int y, ValidTileDetector d) {
		valid = d;
		valid.showValidTile2(x, y, r);


	}



}
