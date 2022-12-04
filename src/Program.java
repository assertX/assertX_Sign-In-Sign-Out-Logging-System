package assignment_7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws IOException {
		// Open files, scanner, and writer.
		FileInputStream inputFile = new FileInputStream("users.txt");
		Scanner scanner = new Scanner(inputFile);
		FileOutputStream outputFile = new FileOutputStream("log.txt");
		PrintWriter writer = new PrintWriter(outputFile);
		
		// Create a RegularUser object.
		RegularUser user = new RegularUser(null);
		
		// Read the input file.
		while (scanner.hasNextLine()) {
			String username;
			int id;
			String dateTime;
			String activity = scanner.next();
			String userType = scanner.next();
			
			
			// Will determine whether its a regular user or an administrator.
			
			if (userType.equals("REG")) { // Regular user
				username = scanner.next();
				dateTime = scanner.nextLine();
				dateTime = (dateTime.replaceAll("^\\s+", ""));
				user = new RegularUser(username);
				
				
			}
			else { // Administrator
				username = scanner.next();
				id = scanner.nextInt();
				dateTime = scanner.nextLine();
				dateTime = (dateTime.replaceAll("^\\s+", ""));
				user.setUsername(username);
				user = new Administrator(username, id);
			}
			// Will determine whether its a sign in or sign out of the current user.
			
			if (activity.equals("IN")) {
				user.signIn(dateTime, writer);
			}
			else {
				user.signOut(dateTime, writer);
			}
			
			
		}
		
		// Close files, scanner, and writer.
		writer.close();
		outputFile.close();
		scanner.close();
		inputFile.close();
		
		
		
	}
	
	
}
