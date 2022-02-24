import java.awt.Color;

/***
 * 
 * @author Elizabeth Reddy 
 * RedID: 824852081 
 * Program 3 
 * Falling Sand 
 * 11-28-21
 *
 */

public class Empty extends Element{

	public Empty() {

	}
	
	public void click(int row, int col, int[][] grid) {
		// default
		
	}

	public void visual(int i, int j, SandDisplay display) {
		display.setColor(i, j, Color.black);
	}

	public void movement(int x, int y, int[][] grid) {
		// default
		
	}

}
