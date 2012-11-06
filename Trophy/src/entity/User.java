package entity;
import java.util.ArrayList;

import trophy.Trophy;


public class User {
	
	public User(com.google.appengine.api.users.User googleAccount) {
		this.googleAccount = googleAccount;
	}
	
	private com.google.appengine.api.users.User googleAccount;
	private ArrayList<StudyMoment> studyMoments;
	private ArrayList<Trophy> trophyList;
	private ArrayList<Course> coursesFollowed;
	private ArrayList<Course> coursesCompleted;
	
	public com.google.appengine.api.users.User getGoogleAccount() {
		return this.googleAccount;
	}

}
