package inClassSep18;

public class Driver {

	public static void main(String[] args) {
		Map map1 = new Map();
		Map map2 = new Map();
		
		map1.initMap();
		map1.addToMap('H', 3,1);
		map1.printMap();
		
		map2.initMap();
		map2.addToMap('G', 2, 2);
		map2.printMap();
		
	}

}
