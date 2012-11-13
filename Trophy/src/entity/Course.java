package entity;

public class Course {
	
	private String courseName;
	private String courseID;
	private int credits;
	
	public Course(String name, String ID, int credits) {
		this.courseName = name;
		this.courseID = ID;
		this.credits = credits;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public String getCourseID() {
		return courseID;
	}
	
	public int getCoursePoints() {
		return credits;
	}
}
