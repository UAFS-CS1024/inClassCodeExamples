package inClassSep20;

public class MyArrayList {
	private int capacity;
	private int[] theArray;
	private int size;
	
	public MyArrayList() {
		capacity=10;
		theArray = new int[capacity];
		size=0;
	}
	
	public MyArrayList(int capacity) {
		this.capacity=capacity;
		theArray = new int[capacity];
		size=0;
	}
	
	public void show() {
		int index;
		
		System.out.printf("[");
		for(index=0;index<size;index++) {
			if(index!=0) {
				System.out.printf(",");
			}
			System.out.printf("%d", theArray[index]);
		}
		System.out.printf("]\n");
	}
	
	public void append(int value) {
		theArray[size]=value;
		size++;
	}
	
	public void clear() {
		size=0;
	}
	
	public int remove() {
		size--;
		return theArray[size];
	}
	
	public int getSize() {
		return size;
	}
	
	private void reSize() {
		int[] dest = new int[theArray.length+capacity];
		int index;
		
		for(index=0;index<theArray.length;index++) {
			dest[index] = theArray[index];
		}
		theArray = dest;
	}
	
}
