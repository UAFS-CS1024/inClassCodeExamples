package inClassAug30;

import java.util.Random;

public class Assign {

	public static void main(String[] args) {
		int[] numbers= new int[1000000];
			
		if(loadRandomUnique(numbers,1000000)==0) {
			System.out.println("hello");
			//showArray(numbers);
		}else {
			System.out.printf("Error");
		}
		
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
	
	public static void showArray(char[] array) {
		int index;
		
		System.out.print("[");
		for(index=0;index<array.length;index++) {
			if(index!=0) {
				System.out.print(",");
			}
			System.out.printf("%c",array[index]);
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
	
	public static void loadRandom(int[] array, int max, int min) {
		int index;
		
		Random rand = new Random();
		for(index=0;index<array.length;index++) {
			array[index]=rand.nextInt(max-min+1) + min;
		}
	}
	
	public static int loadRandomUnique(int[] array, int max) {
		int index;
		boolean[] used = new boolean[max];
		
		if(max<array.length) {
			return 1;
		}
		Random rand = new Random();
		for(index=0;index<array.length;index++) {
			array[index]=rand.nextInt(max);
			while(used[array[index]]==true) {
				array[index]=rand.nextInt(max);
			}
			used[array[index]]=true;
		}		
		return 0;
	}

}
