package gameModel;

/**
 *
 * @author 		Dario
 * @version		1.2
 * @since		1.0
 *
 * Description:
 * Board Class only store values for tile size, board width and board height;
 */
public class Board {
	private int tile_size;
	private int width;
	private int height;

	public Board(){
		this.height = 14;
		this.tile_size = 50;
		this.width = 13;
	}

	public int getTileSize(){
		return tile_size;
	}

	public int getWidth(){
		return width;
	}

	public int getHeight(){
		return height;
	}

}
