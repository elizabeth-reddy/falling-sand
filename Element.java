
public abstract class Element {
	public static final int EMPTY = 0;
	public static final int METAL = 1;
	public static final int SAND = 2;
	public static final int WATER = 3;
	public static final int CONFETTI = 4;
	public static final int RAINBOW = 5;
	public static final int JESUS = 6;
	public static final int PAINTBRUSH = 7;
	public static final int FROZONE = 8;
	
	public abstract void click(int row, int col, int[][] grid);
	
	public abstract void visual(int x, int y, SandDisplay d);
	
	public abstract void movement(int x, int y, int[][] grid);

}
