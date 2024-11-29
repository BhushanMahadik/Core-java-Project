package project;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Db database = new Db();
		
		mainloop: while (true) {
			System.out.println(
					"Select 1 to create new user\nSelect 2 to show all users \nSelect 3 to get user by id \n"
					+ "select 0 for exit"
					);
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter username");
				String username = sc.next();	
				
				System.out.println("Enter password");
				String password = sc.next();
				
				User user = new User(username , password);
				User createUser = database.createUser(user);
				
				if (createUser != null) {
					System.out.println("User created successfully");
					System.out.println(createUser);
				}
				else {
					System.out.println("User not created something went wrong");
				}
				break;
			}
			
			case 2: {
				System.out.println(database.getAllUsers());
				break;
			}
			
			case 3: {
				System.out.println("Enter id");
				int id = sc.nextInt();
				User UserById = database.getUserById(id);
				if(UserById != null) {
					System.out.println(UserById);
				}else {
					System.out.println("User not found");
				}
				break;
			}
			
			case 0: {
				System.out.println("Exit: Thankyou!.....");
				break mainloop;
			}
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}

}
