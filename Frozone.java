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

public class Frozone extends Element{
	
	public Frozone() {

	}

	public void click(int row, int col, int[][] grid) {
		// default
		
	}
	
	public void visual(int i, int j, SandDisplay display) {
		display.setColor(i, j, Color.cyan);
	}

	public void movement(int x, int y, int[][] grid) {
		if (((y + 1) < grid[0].length) && (y > 0)) {
			if (grid[x][y + 1] == WATER) {
				grid[x][y + 1] = FROZONE;
			}
			if (grid[x][y - 1] == WATER) {
				grid[x][y - 1] = FROZONE;
			}
			if (grid[x + 1][y] == WATER) {
				grid[x + 1][y] = FROZONE;
			}
			if (grid[x - 1][y] == WATER) {
				grid[x - 1][y] = FROZONE; // turn all water pixels around it into ice
			}
		}
	}
	
}
