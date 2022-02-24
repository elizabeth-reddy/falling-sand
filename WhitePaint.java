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

public class WhitePaint extends Element{


	public WhitePaint() {

	}

	public void click(int row, int col, int[][] grid) {
		if (col > 5 && (col + 5) < grid[0].length && row > 5 && (row + 5) < grid.length) {
			int i = 0;
			int j = 0;
			for (i = 0; i < 6; i++) {
				for (j = 0; j < 6; j++) {
					grid[row + i][col + j] = PAINTBRUSH;
				}
			}
		}
	}

	public void visual(int i, int j, SandDisplay display) {
		display.setColor(i, j, (new Color(255, 255, 255)));
	}

	public void movement(int x, int y, int[][] grid) {
		// default
		
	}

}
