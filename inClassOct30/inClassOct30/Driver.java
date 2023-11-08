package inClassOct30;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		CourseDAO courseDAO = new CourseDAO();
		
		Course course = new Course("CS 1014","Programming I",4,"Cuevas");
		Course course1 = new Course("CS1024","Programming II",4,"Hightower");
		Course course2 = new Course("CS 2003","Data Structures",3,"Mackey");
		Course course3 = new Course("CS 3003","Distributed Systems",3,"Cuevas");
		
		// 1. Test addCourse Method
	/*	courseDAO.addCourse(course);
		courseDAO.addCourse(course1);
		courseDAO.addCourse(course2);
		courseDAO.addCourse(course3); */
		
		showCourses(courseDAO);
		
		//3. Tst getCourse Method
		Course courseT;
		courseT = courseDAO.getCourse("CS 2003");
		System.out.println(courseT.serialize());
		//4. updateCourse
		courseT.setInstructor("Kidder");
		courseDAO.updateCourse(courseT);
		//5. deleteCourse
		courseDAO.deleteCourse("CS1024");
		showCourses(courseDAO);
	}
	
	public static void showCourses(CourseDAO courseDAO) {
		//2 2. getCourses Test
		ArrayList<Course> courses = courseDAO.getCourses();
		int index;
		Course course;
		System.out.printf("%-8s %-20s %-3s %-10s\n",
				"Course No","Title","Hrs","Instructor");
		
		for(index=0;index<courses.size();index++) {
			course = courses.get(index);
			System.out.printf("%-8s %-20s %-3d %-10s\n",
					course.getCourseNo(),course.getTitle(),course.getCreditHrs(),course.getInstructor());
		}
	}

}
