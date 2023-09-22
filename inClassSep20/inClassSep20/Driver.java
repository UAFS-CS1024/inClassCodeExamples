package inClassSep20;

public class Driver {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(1);
		MyArrayList list2 = new MyArrayList();
		int val;
		
		list.append(10);
		list.append(20);
		list.append(30);
		val=list.remove();
		list.show();
		System.out.println(val + " " + list.getSize());
		list.clear();
		list.show();
	
		
		list2.append(100);
		list2.append(200);
		list2.append(300);
		list2.append(400);
		list2.show();
		list2.add(2, 1000);
		int location = list2.indexOf(1000);
		System.out.printf("Location: %d\n", location);
		int[] newArray = list2.toArray();
		int index;
		for(index=0;index<newArray.length;index++) {
			System.out.printf("[%d]: %d\n",index,newArray[index]);
		}
		
	}

}
