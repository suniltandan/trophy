package database;

import java.util.ArrayList;

import entity.User;

public class UserRegistry {
	
	private static UserRegistry instance;
	private ArrayList<User> users;

	public static UserRegistry getInstance() {
		if (instance == null)
			return new UserRegistry();
		return instance;
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}
	
	public User getUser(com.google.appengine.api.users.User googleAccount) {
		for (User user : users)
			if (user.getGoogleAccount().equals(googleAccount))
				return user;
		return null;
	}

}
