package assignment_7;

import java.io.PrintWriter;

public class Administrator extends RegularUser{
	// Data field
	private int id;
	
	// Constructors
	public Administrator() { // Default Constructor
		super();
		id = 0;
	}
	public Administrator(String username, int id) {
		super(username);
		this.id = id;
	}
	
	
	// Getters
	
	/**
	 * This will return the current id
	 * @return: id will be returned (integer).
	 */
	public int getID() {return id;}
	
	
	// Setters
	
	/**
	 * This will update the id with the given id
	 * @param id: updated id for the administrator
	 */
	public void setID(int id) {this.id = id;}
	
	
	// Methods
	
	/** 
	 * Writes the given format to the output file
	 * @param dateTime: the date and time of the sign in for the administrator
	 * @param writer: the ability to write to the output file
	 */
	@Override
	public void signIn(String dateTime, PrintWriter writer) {
		writer.format("Administrator [%s] (%d) signed in @ [%s]\n", getUsername(), getID(), dateTime);
	}
	/** 
	 * Writes the given format to the output file
	 * @param dateTime: the date and time of the sign out for the administrator
	 * @param writer: the ability to write to the output file
	 */
	@Override
	public void signOut(String dateTime, PrintWriter writer) {
		writer.format("Administrator [%s] (%d) signed out @ [%s]\n", getUsername(), getID(), dateTime);
	}
	
	
	
}
