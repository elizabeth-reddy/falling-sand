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

public class Sand extends Element{


	public Sand() {

	}
	
	public void click(int row, int col, int[][] grid) {
		// TODO Auto-generated method stub
		
	}

	public void visual(int x, int y, SandDisplay d) {
		d.setColor(x, y, Color.yellow);
	}

	public void movement(int x, int y, int[][] grid) {
		if (grid[x + 1][y] == EMPTY) {
			grid[x][y] = EMPTY;
			grid[x + 1][y] = SAND; // if pixel below is empty, swap sand and empty pixel
		}
		if (grid[x + 1][y] == RAINBOW) {
			grid[x][y] = RAINBOW;
			grid[x + 1][y] = SAND; // if pixel below is rainbow, swap sand and rainbow
		} else if (grid[x + 1][y] == WATER) {
			grid[x][y] = WATER;
			grid[x + 1][y] = SAND; // if pixel below is water, swap sand and water
		} else if (grid[x + 1][y] == JESUS) {
			grid[x][y] = JESUS;
			grid[x + 1][y] = SAND; // if pixel below is wine, swap sand and wine
		}
	}
}
