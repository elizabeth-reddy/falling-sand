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

public class Confetti {

	public static final int EMPTY = 0;
	public static final int METAL = 1;
	public static final int SAND = 2;
	public static final int WATER = 3;
	public static final int CONFETTI = 4;
	public static final int RAINBOW = 5;
	public static final int JESUS = 6;
	public static final int PAINTBRUSH = 7;
	public static final int FROZONE = 8;

	public Confetti() {

	}

	public void visual(int x, int y, SandDisplay d) {
		Random rand = new Random();
		Color confetti = null;
		int num = rand.nextInt(7);
		if (num == 0) {
			confetti = new Color(255, 0, 0); // red
		}
		if (num == 1) {
			confetti = new Color(255, 153, 0); // orange
		}
		if (num == 2) {
			confetti = new Color(255, 255, 0); // yellow
		}
		if (num == 3) {
			confetti = new Color(0, 204, 0); // green
		}
		if (num == 4) {
			confetti = new Color(0, 0, 245); // blue
		}
		if (num == 5) {
			confetti = new Color(102, 0, 153); // purple
		}
		if (num == 6) {
			confetti = new Color(255, 255, 255); // white
		}
		d.setColor(x, y, confetti);
	}

	public void movement(int x, int y, int[][] grid) {
		Random rand = new Random();
		int num;
		if (((y + 1) < grid[0].length) && (y > 0)) {
			if ((grid[x][y + 1] == EMPTY) && (grid[x][y - 1] == EMPTY) && (grid[x + 1][y] == EMPTY)) {
				num = rand.nextInt(3); // falls in random directions
				if (num == 0)
					grid[x][y + 1] = CONFETTI; // falls right
				if (num == 1)
					grid[x][y - 1] = CONFETTI; // falls left
				if (num == 2)
					grid[x + 1][y] = CONFETTI; // falls right
			} else if (((y + 1) < grid[0].length) && (grid[x][y + 1] == EMPTY)) {
				grid[x][y + 1] = CONFETTI;
			} else if ((y > 0) && (grid[x][y - 1] == EMPTY)) {
				grid[x][y - 1] = CONFETTI;
			} else if (grid[x + 1][y] == EMPTY) {
				grid[x + 1][y] = CONFETTI; // disappears at bottom
			}
		}

		grid[x][y] = EMPTY;
	}

}
