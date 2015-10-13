import java.util.*;

public class ChangeGrade 

{
 static int studentPos;
 static Scanner userInput = new Scanner(System.in);
	public static void changeGradeRun()
	{
		System.out.println("Which student's grade would you like to change?");
		printStudents();
		studentPos = userInput.nextInt();
	}
	public static void printStudents()
	{
		int c =0;
		for(Student fred : importFile.studentList)
		{
			
			System.out.println(c+1 + ") "+fred.getFirstName());
			c++;
		}
	}
	public static void selectStudent()
	{
		
	}
	
	
}
