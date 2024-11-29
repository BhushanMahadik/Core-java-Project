package project;

public class User {
	private int id;
	private String username;
	private String password;
	static int num = 1;
	
	public User() {
		
	}


	public User(String username, String password) {
		super();
		this.id = User.num;
		this.username = username;
		this.password = password;
		User.num++;
	}
	
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}


	public static void main(String[] args) {
			
	}

}
