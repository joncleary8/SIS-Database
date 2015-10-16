import java.util.*;
public class RemoveStudent 

{
static int studentToDelete;
static Scanner userInput = new Scanner(System.in);
	public static void deleteStudentRun()
	{
		System.out.println("Which student would you like to delete?");
		ChangeGrade.printStudents();
		studentToDelete = userInput.nextInt();
		
		
	}
	
	
	
	
}
