import java.util.*;

/***
 * 
 * @author Elizabeth Reddy 
 * RedID: 824852081 
 * Program 3 Falling Sand 
 * 11-28-21
 *
 */

public class SandLab {
	public static void main(String[] args) {
		SandLab lab = new SandLab(120, 80);
		lab.run();
	}

	// add constants for particle types here
	public static final int EMPTY = 0;
	public static final int METAL = 1;
	public static final int SAND = 2;
	public static final int WATER = 3;
	public static final int CONFETTI = 4;
	public static final int RAINBOW = 5;
	public static final int JESUS = 6;
	public static final int PAINTBRUSH = 7;
	public static final int FROZONE = 8;

	// do not add any more fields
	private int[][] grid;
	private SandDisplay display;

	public SandLab(int numRows, int numCols) {
		String[] names;
		names = new String[9];
		names[EMPTY] = "Empty";
		names[METAL] = "Metal";
		names[SAND] = "Sand";
		names[WATER] = "Water";
		names[CONFETTI] = "Confetti";
		names[RAINBOW] = "Rainbow";
		names[JESUS] = "Jesus";
		names[PAINTBRUSH] = "White Paint";
		names[FROZONE] = "Frozone";
		display = new SandDisplay("Falling Sand", numRows, numCols, names);
		grid = new int[numRows][numCols];
	}

	// called when the user clicks on a location using the given tool
	private void locationClicked(int row, int col, int tool) {
		Rainbow r = new Rainbow();
		Jesus je = new Jesus();
		WhitePaint wp = new WhitePaint();
		if (tool == RAINBOW) {
			r.click(row, col, grid);
		} else if (tool == JESUS) {
			je.click(row, col, grid);
		} else if (tool == PAINTBRUSH) {
			wp.click(row, col, grid);
		} else {
			grid[row][col] = tool;
		}
	}

	// copies each element of grid into the display
	public void updateDisplay() {
		Empty e = new Empty();
		Metal m = new Metal();
		Sand s = new Sand();
		Water w = new Water();
		Confetti c = new Confetti();
		Rainbow r = new Rainbow();
		Jesus je = new Jesus();
		WhitePaint wp = new WhitePaint();
		Frozone f = new Frozone();

		int i = 0;
		int j = 0;
		for (i = 0; i < grid.length; i++) {
			for (j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == EMPTY) {
					e.visual(i, j, display);
				} else if (grid[i][j] == METAL) {
					m.visual(i, j, display);
				} else if (grid[i][j] == SAND) {
					s.visual(i, j, display);
				} else if (grid[i][j] == WATER) {
					w.visual(i, j, display);
				} else if (grid[i][j] == CONFETTI) {
					c.visual(i, j, display);
				} else if (grid[i][j] == RAINBOW) {
					r.visual(i, j, display);
				} else if (grid[i][j] == JESUS) {
					je.visual(i, j, display);
				} else if (grid[i][j] == PAINTBRUSH) {
					wp.visual(i, j, display);
				} else if (grid[i][j] == FROZONE) {
					f.visual(i, j, display);
				}
			}
		}
	}

	// called repeatedly.
	// causes one random particle to maybe do something.
	public void step() {
		Random rand = new Random();
		int x = rand.nextInt(grid.length - 1);
		int y = rand.nextInt(grid[0].length);

		Sand s = new Sand();
		Water w = new Water();
		Confetti c = new Confetti();
		Jesus je = new Jesus();
		Frozone f = new Frozone();

		if (grid[x][y] == SAND) {
			s.movement(x, y, grid);
		} else if (grid[x][y] == WATER) {
			w.movement(x, y, grid);
		} else if (grid[x][y] == CONFETTI) {
			c.movement(x, y, grid);
		} else if (grid[x][y] == JESUS) {
			je.movement(x, y, grid);
		} else if (grid[x][y] == FROZONE) {
			f.movement(x, y, grid);
		}
	}

	// do not modify
	public void run() {
		while (true) {
			for (int i = 0; i < display.getSpeed(); i++)
				step();
			updateDisplay();
			display.repaint();
			display.pause(1); // wait for redrawing and for mouse
			int[] mouseLoc = display.getMouseLocation();
			if (mouseLoc != null) // test if mouse clicked
				locationClicked(mouseLoc[0], mouseLoc[1], display.getTool());
		}
	}
}