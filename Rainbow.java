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

public class Rainbow extends Element{

	public Rainbow() {

	}

	public void click(int row, int col, int[][] grid) {
		if (grid[row][col] == EMPTY) { // rainbow can only be painted on empty space
			grid[row][col] = RAINBOW;
		}
	}

	public void visual(int i, int j, SandDisplay d) {
		if ((j % 18) < 3) {
			d.setColor(i, j, Color.red);
		} else if (j % 18 < 6) {
			d.setColor(i, j, Color.orange);
		} else if (j % 18 < 9) {
			d.setColor(i, j, Color.yellow);
		} else if (j % 18 < 12) {
			d.setColor(i, j, Color.green);
		} else if (j % 18 < 15) {
			d.setColor(i, j, Color.blue);
		} else if (j % 18 < 18) {
			d.setColor(i, j, (new Color(102, 0, 153))); // purple
		}
	}

	@Override
	public void movement(int x, int y, int[][] grid) {
		// default
		
	}

}
