package gameModel;

public class Tile {

	private int sideSize;

	/**
	 * initial tile with the input size
	 * @Requires ("size>=0")
	 */
	public Tile(int size){
		this.sideSize = size;
	}
	/**
	 * return the tile size when other needs
	 * @Ensures ("sideSize >= 0")
	 */
	public int getSideSize(){
		return sideSize;
	}





}
