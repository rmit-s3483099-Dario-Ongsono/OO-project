package view;

public class Location {
	private static int newX;
	private static int newY;
	private static int index = 0;
	
	public static void setNewLocation(int x, int y){
		newX = x;
		newY = y;
		index = 1;
	}
	
	public static int getNewX(){
		
		index += 1;
		return newX;
	}
	
	public static int getNewY(){
		index += 1;
		return newY;
	}
	
	public static int getIndex(){
		return index;
	}
}
