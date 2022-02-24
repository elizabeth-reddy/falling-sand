import java.awt.Color;
import java.util.Random;

/***
 * 
 * @author Elizabeth Reddy
 * RedID: 824852081
 * Program 3
 * Falling Sand
 * 11-28-21
 *
 */

public class Water extends Element{

	public Water() {

	}

	public void click(int row, int col, int[][] grid) {
		// default
		
	}
	public void visual(int x, int y, SandDisplay d) {
		d.setColor(x, y, Color.blue);
	}

	public void movement(int x, int y, int[][] grid) {
		Random rand = new Random();
		int num;
		if (grid[x + 1][y] == EMPTY) {
			grid[x][y] = EMPTY;
			grid[x + 1][y] = WATER;// water always falls down, same as sand
		} else if (grid[x + 1][y] == RAINBOW) {
			grid[x][y] = RAINBOW;
			grid[x + 1][y] = WATER;// water always falls under rainbow too
		} else if (y > 0 && (y + 1) < grid[0].length) {
			if (grid[x][y + 1] == EMPTY || grid[x][y - 1] == EMPTY) {
				num = rand.nextInt(2); // if empty on both sides use rand num to decide left or right
				if (num == 0 && grid[x][y + 1] == EMPTY) {
					grid[x][y] = EMPTY;
					grid[x][y + 1] = WATER; // go right
				}
				if (num == 1 && grid[x][y - 1] == EMPTY) {
					grid[x][y] = EMPTY;
					grid[x][y - 1] = WATER; // go left
				}
			}
		}
	}


}
