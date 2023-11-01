package inClassOct30;

import java.util.ArrayList;

public interface DAO {
	public ArrayList<Course> getCourses();   	 // R - Retrieve
	public Course getCourse(String courseNo); 
	public int addCourse(Course course);		// C - Create
	public int deleteCourse(String courseNo);	// D = Delete
	public int updateCourse(Course course);		// U - Update
}
