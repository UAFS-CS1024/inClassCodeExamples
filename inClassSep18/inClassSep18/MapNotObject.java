package inClassSep18;

public class MapNotObject {
	
	public static final int ROWS=5;
	public static final int COLS=5;

	public static void main(String[] args) {
		char[][] map = new char[ROWS][COLS];
		
		initMap(map);
		printMap(map);
		addToMap(map,'H',2,3);
		printMap(map);

	}
	
	public static void initMap(char[][] array) {
		int row,col;
		
		for(row=0;row<ROWS;row++) {
			for(col=0;col<COLS;col++) {
				array[row][col]='.';
			}
		}
	}
	
	public static void printMap(char[][] array) {
		int row,col;
		
		for(row=0;row<ROWS;row++) {
			for(col=0;col<COLS;col++) {
				System.out.printf(" %c ", array[row][col]);
			}
			System.out.printf("\n");
		}
		System.out.printf("\n\n");
	}
	
	public static void addToMap(char[][] array,char ch,int row, int col) {
		array[row][col]=ch;
	}

}
