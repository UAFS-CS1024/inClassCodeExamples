package inClassSep20;

public class Driver {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(5);
		int val;
		
		list.append(10);
		list.append(20);
		list.append(30);
		val=list.remove();
		list.show();
		System.out.println(val + " " + list.getSize());
		list.clear();
		list.show();
		
	}

}
