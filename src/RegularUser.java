package assignment_7;

import java.io.PrintWriter;

public class RegularUser {
	// Data fields.
	private String username;
	
	// Constructors
	
	public RegularUser () {username = ""; } // Default Constructor
	
	public RegularUser (String username) {this.username = username;}
	
	
	// Getters
	
	/**
	 * This will return the username of the user
	 * @return: username of the user
	 */
	public String getUsername () {return username;}
	
	
	// Setters
	
	/**
	 * This will update the username with the given username
	 * @param username: updated username of the user.
	 */
	public void setUsername (String username) {this.username = username;}
	
	
	// Methods
	
	/** 
	 * Writes the given format to the output file
	 * @param dateTime: the date and time of the sign in for regular user
	 * @param writer: the ability to write to the output file
	 */
	public void signIn(String dateTime, PrintWriter writer) { 
		writer.format("Regular user [%s] signed in @ [%s]\n", username, dateTime);
	}
	/** 
	 * Writes the given format to the output file
	 * @param dateTime: the date and time of the sign out for regular user
	 * @param writer: the ability to write to the output file
	 */
	public void signOut(String dateTime, PrintWriter writer) { 
		writer.format("Regular user [%s] signed out @ [%s]\n", username, dateTime);
	}
}
