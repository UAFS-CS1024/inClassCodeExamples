package inClassOct30;

public class Course implements Record {
	private String courseNo;
	private String title;
	private int creditHrs;
	private String instructor;
	
	public String getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCreditHrs() {
		return creditHrs;
	}
	public void setCreditHrs(int creditHrs) {
		this.creditHrs = creditHrs;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	public Course(String courseNo, String title, int creditHrs, String instructor) {
		this.setCourseNo(courseNo);
		this.setTitle(title);
		this.setCreditHrs(creditHrs);
		this.setInstructor(instructor);
	}
	@Override
	public String serialize() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deSerialize(String str) {
		// TODO Auto-generated method stub
		
	}

}
