package inClassAug30;

import java.util.Random;

public class Assign {

	public static void main(String[] args) {
		int[] numbers= {10,20,30,40,50};
		
		loadOddEven(numbers,1);
		showArray(numbers);
		
	}
	
	public static void showArray(int[] array) {
		int index;
		
		System.out.print("[");
		for(index=0;index<array.length;index++) {
			if(index!=0) {
				System.out.print(",");
			}
			System.out.print(array[index]);
		}
		System.out.println("]");
		
	}
	
	public static void loadOddEven(int[] array, int choice) {
		int index;
		
		Random rand = new Random();
		for(index=0;index<array.length;index++) {
			array[index]=rand.nextInt(100) + 1;
			while(array[index]%2==choice) {
				array[index]=rand.nextInt(100) + 1;
			}
		}
	}

}
