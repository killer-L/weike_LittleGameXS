import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

public class Map extends BaseImage {
	Image Tree, Grass, Wall, Minions, Home, End;

	private int map[][] = { 
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 3, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 1 },
			{ 1, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 1 },
			{ 1, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 1 },
			{ 1, 0, 2, 2, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 1 }, 
			{ 1, 0, 0, 0, 0, 0, 2, 0, 2, 0, 2, 0, 2, 0, 1 },
			{ 1, 2, 2, 2, 2, 0, 2, 0, 0, 0, 2, 0, 2, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 2, 0, 2, 2, 2, 0, 2, 0, 1 },
			{ 1, 2, 2, 2, 2, 2, 2, 0, 2, 0, 2, 2, 2, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 2, 0, 1 },
			{ 1, 0, 2, 2, 2, 2, 2, 2, 2, 0, 2, 0, 2, 0, 1 }, 
			{ 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 1 },
			{ 1, 0, 0, 0, 2, 2, 0, 2, 0, 2, 0, 2, 0, 4, 1 }, 
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, };

	/*
	 * { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0, 0, 0,
	 * 0, 2, 0, 0, 0, 0, 0, 1 }, { 1, 0, 0, 0, 0, 0, 2, 0, 2, 0, 2, 0, 2, 0, 1
	 * }, { 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 2, 0, 1 }, { 1, 0, 0, 0, 0, 0,
	 * 0, 0, 2, 0, 2, 0, 2, 0, 1 }, { 1, 0, 2, 2, 2, 0, 0, 0, 2, 0, 2, 0, 2, 0,
	 * 1 }, { 1, 0, 2, 0, 2, 0, 0, 0, 2, 0, 2, 0, 2, 0, 1 }, { 1, 0, 0, 0, 0, 0,
	 * 0, 0, 0, 0, 2, 0, 2, 0, 1 }, { 1, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 0, 2, 0,
	 * 1 }, { 1, 0, 2, 2, 2, 2, 0, 0, 2, 0, 2, 2, 2, 0, 1 }, { 1, 0, 0, 0, 0, 0,
	 * 0, 0, 2, 0, 0, 0, 2, 0, 1 }, { 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 2, 0,
	 * 1 }, { 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 1 }, { 1, 0, 0, 0, 2, 2,
	 * 2, 2, 2, 2, 2, 2, 0, 4, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
	 * 1 }, };
	 */

	Map() {
		Tree = super.loadeImage(Const.TREEPATH);
		Wall = super.loadeImage(Const.WALLPATH);
		Grass = super.loadeImage(Const.GRASSPATH);
		Home = super.loadeImage(Const.HOMEPATH);
		End = super.loadeImage(Const.ENDPATH);
		// Minions = super.loadeImage(Const.PERSONPATH);
	}

	public void draw(Graphics g, ImageObserver io) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				switch (map[i][j]) {
				case 0:
					g.drawImage(Grass, j * Const.BLOCK, i * Const.BLOCK, io);
					break;
				case 1:
					g.drawImage(Wall, j * Const.BLOCK, i * Const.BLOCK, io);
					break;
				case 2:
					g.drawImage(Tree, j * Const.BLOCK, i * Const.BLOCK, io);
					break;
				case 3:
					g.drawImage(Home, j * Const.BLOCK, i * Const.BLOCK, io);
					break;
				case 4:
					g.drawImage(End, j * Const.BLOCK, i * Const.BLOCK, io);
					break;
				}
			}
		}
	}

	public boolean moveable(int x, int y) {
		if (y >= 0 && y < map.length && x >= 0 && x < map[0].length) {
			if (map[y][x] == 0) {
				return true;
			}if (map[y][x] == 3) {
				return true;
			}if (map[y][x] == 4) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}
}
