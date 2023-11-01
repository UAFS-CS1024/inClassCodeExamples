package inClassOct30;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CourseDAO implements DAO {
	private static ArrayList<Course> courses;
	
	public CourseDAO() {
		loadFromFile();
	}

	private void loadFromFile() {
		FileReader readFile;
		BufferedReader in;
		String buffer;
		Course course;
		
		try {
			readFile = new FileReader("courses.txt");
			in = new BufferedReader(readFile);
			buffer=in.readLine();
			while(buffer!=null) {
				course = new Course();
				course.deSerialize(buffer);
				courses.add(course);
				buffer=in.readLine();
			}
			in.close();
			readFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.printf("File not found...\n");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public ArrayList<Course> getCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course getCourse(String courseNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addCourse(Course course) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCourse(String courseNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateCourse(Course course) {
		// TODO Auto-generated method stub
		return 0;
	}

}
