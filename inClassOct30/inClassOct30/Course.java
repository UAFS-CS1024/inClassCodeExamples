package inClassOct30;

public class Course implements Record {
	public final int COURSENO = 0;
	public final int TITLE = 1;
	public final int CREDITHRS = 2;
	public final int INSTRUCTOR = 3;
	
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
	
	public Course() {
		
	}
	
	public Course(String courseNo, String title, int creditHrs, String instructor) {
		this.setCourseNo(courseNo);
		this.setTitle(title);
		this.setCreditHrs(creditHrs);
		this.setInstructor(instructor);
	}
	@Override
	public String serialize() {
		String str = this.getCourseNo() + "," + this.getTitle() + "," +
				this.getCreditHrs() + "," + this.getInstructor();
		return str;
	}
	@Override
	public void deSerialize(String str) {
		String[] fields;
		
		fields=str.split(",");
		this.setCourseNo(fields[COURSENO]);
		this.setTitle(fields[TITLE]);
		this.setCreditHrs(Integer.parseInt(fields[CREDITHRS]));
		this.setInstructor(fields[INSTRUCTOR]);
		
	}

}
