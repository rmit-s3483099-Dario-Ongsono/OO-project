package gameController;

/**
 *
 * @author 		Jie Yi
 * @version		1.2
 * @since		1.0
 *
 * Description:
 *
 */

public class TurnChecker {
	private static int count;

	public TurnChecker(){

	}

	public int count(){
		count += 1;
		return count;
	}

	public boolean isTurn(){
		if(count % 2 == 0)
			return true;
		return false;
	}
}
