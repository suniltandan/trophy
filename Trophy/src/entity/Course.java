package entity;

public class Course {
	private String coursename;
	private int coursepoints;
	
	public Course(String cname, int cp) {
		coursename = cname;
		coursepoints = cp;
	}
	
	public String getCourseName() {
		return coursename;
	}
	
	public int getCoursePoints() {
		return coursepoints;
	}
}
