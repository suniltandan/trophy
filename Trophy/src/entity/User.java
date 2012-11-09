package entity;

import java.util.ArrayList;
import java.util.Date;

import trophy.Trophy;


public class User {
	ArrayList<Course> coursesfollowing;
	ArrayList<Course> coursesfollowed;
	ArrayList<Trophy> thryphylist;
	StudyMoment studymoments;
	
	public User() {
		//init all values
		coursesfollowing = new ArrayList<Course>();
		coursesfollowed = new ArrayList<Course>();
		thryphylist = new ArrayList<Trophy>();
	}
	
	public ArrayList<Course> getFollowingCourses() {
		return coursesfollowing;
	}
	
	public ArrayList<Course> getFollowedCourses() {
		return coursesfollowing;
	}
	
	public boolean setFollowingCourse(Course c) {
		//Check if course already exist in coursesfollowing
		// return true if not exist and add!
		// check if coursesfollowed contains and delete!
		return false;
	}
	
	public boolean deleteFollowingCourse(Course c) {
		//check if course already exist in coursesfollowing
		//return true if can delete and add to coursesfollowed
		return false;
	}
	
	public boolean startStudyMoment(Course c, Date startd, StudyType sp) {
		//if no studymoment running => start studymoment
		// return true if could start
		return false;
	}
	
	public StudyMoment getCurrentStudyMoment() {
		return studymoments;
	}
	
	public boolean stopStudyMoment() {
		//return true if could stop studymoment
		return false;
	}
}
