package tuna;


public class tuna {
	private String user;
	private String userID;
	public void setUser(String name, String ln) {
		user = name;
		userID = ln;
		// input function for user's name and ID
	}
		public String getName() {
			return user + userID;
			//return the user's name and ID Number values
	}
		public void saying() {
			System.out.printf("Username Entered: %s", getName());
			// prints out your user's name and ID number from "apples" class.
		}
		
		
		
	}
	// ID class