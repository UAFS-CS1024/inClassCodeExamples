package inClassSep18;

public class Map {
	public final int ROWS=5;
	public final int COLS=5;
	
	//** Instance Variables
	private char[][] map = new char[ROWS][COLS];
	
	public void initMap() {
		int row,col;
		
		for(row=0;row<ROWS;row++) {
			for(col=0;col<COLS;col++) {
				map[row][col]='.';
			}
		}
	}
	
	public void printMap() {
		int row,col;
		
		for(row=0;row<ROWS;row++) {
			for(col=0;col<COLS;col++) {
				System.out.printf(" %c ", map[row][col]);
			}
			System.out.printf("\n");
		}
		System.out.printf("\n\n");
	}
	
	public void addToMap(char ch,int row, int col) {
		map[row][col]=ch;
	}

}
