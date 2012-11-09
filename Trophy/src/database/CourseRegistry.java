package database;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.http.*;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.FetchOptions;
import entity.Course;

public class CourseRegistry {
	public boolean setCourse(Course c) {
		Key activiteit = KeyFactory.createKey("Courses", "courses");

		return false;
	}
	
	public ArrayList<Course> getCourses() {
		return null;
	}
}
