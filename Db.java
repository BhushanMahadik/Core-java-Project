package project;

import java.util.Collection;
import java.util.LinkedHashMap;

public class Db {
	LinkedHashMap<Integer, User> database = new LinkedHashMap<Integer, User>();
	
	public User createUser(User user) {
		database.put(user.getId(), user);
		return getUserById(user.getId());
		
	}
	
	public Collection<User> getAllUsers(){
		return database.values();
	}
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return database.get(id);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
