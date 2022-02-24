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

public class Jesus extends Element{

	public Jesus() {

	}

	public void click(int row, int col, int[][] grid) {
		if (grid[row][col] == WATER) { // JESUS only interacts with water
			grid[row][col] = JESUS;
		}
	}

	public void visual(int x, int y, SandDisplay d) {
		d.setColor(x, y, (new Color(153, 0, 0)));
	}

	public void movement(int x, int y, int[][] grid) {
		Random rand = new Random();
		int num;
		if (((y + 1) < grid[0].length) && (y > 0)) {
			if (grid[x][y + 1] == WATER) {
				grid[x][y + 1] = JESUS;
			}
			if (grid[x][y - 1] == WATER) {
				grid[x][y - 1] = JESUS;
			}
			if (grid[x + 1][y] == WATER) {
				grid[x + 1][y] = JESUS;
			}
			if (grid[x - 1][y] == WATER) {
				grid[x - 1][y] = JESUS; // turn all water pixels around it into wine
			}
			if (grid[x + 1][y] == EMPTY) {
				grid[x][y] = EMPTY;
				grid[x + 1][y] = JESUS;// wine always falls down, same as sand
			} else if (grid[x + 1][y] == RAINBOW) {
				grid[x][y] = RAINBOW;
				grid[x + 1][y] = JESUS;// wine always falls under rainbow too
			} else if (grid[x][y + 1] == EMPTY || grid[x][y - 1] == EMPTY) {
				num = rand.nextInt(2); // if empty on both sides use rand num to decide left or right
				if (num == 0 && grid[x][y + 1] == EMPTY) {
					grid[x][y] = EMPTY;
					grid[x][y + 1] = JESUS; // go right
				}
				if (num == 1 && grid[x][y - 1] == EMPTY) {
					grid[x][y] = EMPTY;
					grid[x][y - 1] = JESUS; // go left
				}
			}

		}

	}

}
