# assertX_Sign-In-Sign-Out_Logging_System
In this assignment, you are going to write a Java program that implements a simple sign-in/sign-out system.

There are 2 types of users, regular user and administrator.  Both regular user and administrator have a unique username.  In addition, administrator has another data field, which is an unique integer ID number.  Both regular user and administrator have signIn() and signOut() methods, but the methods behave differently for them.

•The input file is a plain text file (filename: users.txt).

•Each row in the input file stores a sign-in/sign-out activity of a regular user or administrator.

•The first data field in a row is either "IN" (representing sign-in activity) or "OUT" (representing sign-out activity).

•The second data field in a row is either "REG" (representing a regular user) or "ADM" (representing an administrator).

•If the second data field in a row is "REG", then the next data field that follows is the username of the regular user; if the second data field in a row is "ADM", then next next 2 data fields that follow are the username and ID of the administrator (in that order).

•Finally, the last data field in each line is the date and time.  Please note that this field may contain spaces, so you need to use the nextLine() method.

•You cannot assume (or guess) the number of sign-in/sign-out activities in the input file.  In other words, no matter how many sign-in/sign-out activities are stored in the input file, your program should correctly process all of them.

•There may be empty lines at the beginning, in the middle, and/or at the end of the input file.  Those empty lines should not affect the data processing of your program.
