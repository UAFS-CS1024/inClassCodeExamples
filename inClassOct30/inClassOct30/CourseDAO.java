package inClassOct30;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CourseDAO implements DAO {
	private ArrayList<Course> courses;
	String fileName;
	
	public CourseDAO() {
		courses = new ArrayList<Course>();
		fileName = "courses.txt";
		loadFromFile();
	}
	
	private void saveToFile() {
		FileWriter writeFile;
		PrintWriter out;
		Course course;
		int index;
		
		try {
			writeFile = new FileWriter(fileName);
			out = new PrintWriter(writeFile);
			for(index=0;index<courses.size();index++) {
				course = courses.get(index);
				out.println(course.serialize());
			}
			out.close();
			writeFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void loadFromFile() {
		FileReader readFile;
		BufferedReader in;
		String buffer;
		Course course;
		
		try {
			readFile = new FileReader(fileName);
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
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public ArrayList<Course> getCourses() {
		return courses;
	}

	@Override
	public Course getCourse(String courseNo) {
		int index;
		Course course=null;
		
		for(index=0;index<courses.size();index++) {
			if(courses.get(index).getCourseNo().equals(courseNo)){
				course = courses.get(index);
				break;
			}
		}
		
		return course;
	}

	@Override
	public int addCourse(Course course) {
		courses.add(course);
		saveToFile();
		return 0;
	}

	@Override
	public int deleteCourse(String courseNo) {
		int index;
		Course course=null;
		
		for(index=0;index<courses.size();index++) {
			if(courses.get(index).getCourseNo().equals(courseNo)){
				courses.remove(index);
				break;
			}
		}
		saveToFile();
		return 0;
	}

	@Override
	public int updateCourse(Course course) {
		int index;
		
		for(index=0;index<courses.size();index++) {
			if(courses.get(index).getCourseNo().equals(course.getCourseNo())){
				courses.remove(index);
				courses.add(index, course);
				break;
			}
		}
		saveToFile();
		return 0;
	}

}
