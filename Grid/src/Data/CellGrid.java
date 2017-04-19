package Data;


import static helpers.Translator.*;
public class CellGrid {
	
	public Cell[][] map;
	
	//ensure all cells are filled with same texture - cement
	public CellGrid() {
		map = new Cell[20][15];
		for (int i=0; i< map.length; i++) {
			for(int j=0; j < map[i].length; j++) {
				//set cells with static dimension
				map[i][j] = new Cell(i * 64, j * 64, 64, 64, CellType.Cement);
			}
		}
	}
	
	public TileGrid(int[][] newMap) {
		map = new Tile[20][15];
		for (int i=0; i< map.length; i++) {
			for(int j=0; j < map[i].length; j++) {
		      //if else statement for dirt or cement
	}
		}
	
	
	public void Draw() {
		for (int i=0; i< map.length; i++) {
			for(int j=0; j < map[i].length; j++) {
				//make dummy cell
				Cell c = map[i][j];
				DrawQuadTex(c.getTexture(), c.getX(), c.getY(), c.getWidth(), c.getHeight());
				
			}
	}

}
}
