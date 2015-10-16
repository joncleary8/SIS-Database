import java.io.IOException;
import java.util.*;
public class RemoveStudent 

{
static int studentToDelete;
static Scanner userInput = new Scanner(System.in);
	public static void deleteStudentRun() throws IOException
	{
		System.out.println("Which student would you like to delete?");
		ChangeGrade.printStudents();
		studentToDelete = userInput.nextInt();
		if(studentToDelete == importFile.studentList.size()+1)
		{
			SISrunner.subMenuAddAndDelete();
		}
		else
		{
			importFile.studentList.remove(studentToDelete-1);
		}
		System.out.println("Here is your updated student list");
		ChangeGrade.printStudents();
		System.out.println();
		SISrunner.subMenuAddAndDelete();
	}
	
	
	
	
}
