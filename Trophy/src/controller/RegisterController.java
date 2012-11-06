package controller;

import database.UserRegistry;
import entity.*;

public class RegisterController {
	
	public void Register(com.google.appengine.api.users.User googleAccount) {
		User user = new User(googleAccount);
		UserRegistry.getInstance().addUser(user);
	}

}
