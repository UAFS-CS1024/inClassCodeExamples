package inClassOct30;

public class Driver {

	public static void main(String[] args) {
		Course course = new Course("CS 1014","Programming I",4,"Cuevas");
		System.out.println(course.serialize());
		
		Course course1 = new Course();
		course1.deSerialize("CS1024,Programming II,4,Hightower");
		System.out.println(course1.getCourseNo() + " - " + course1.getTitle());
	}

}
