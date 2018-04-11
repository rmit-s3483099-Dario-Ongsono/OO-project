package gameModel;

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
