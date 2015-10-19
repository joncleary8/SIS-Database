import java.util.ArrayList;
import java.io.IOException;
import java.util.*;

public class AddStudent 


{
 
	public static void addStudentRun()
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What is the first name of the student");
		String fn = userInput.nextLine();
		System.out.println("What is the last name of the student");
		String ln = userInput.nextLine();
		System.out.println("What is the students first period?");
		System.out.println("1) Biology");
		System.out.println("2) Algebra");
		System.out.println("3) English");
		
		int p1Choice = userInput.nextInt();
		String p1Class = "";
		
		switch(p1Choice)
		{
		case 1: p1Class = "Biology"; 
		break;
		
		case 2: p1Class = "Algebra";
		break;
		
		case 3: p1Class = "English";
		break;
		}	
		
		System.out.println("What is the students grade in "+p1Class);
		String p1Grade = userInput.next();
		
		System.out.println("What is the students second period?");
		System.out.println("1) Biology");
		System.out.println("2) Algebra");
		System.out.println("3) English");
		int p2Choice = userInput.nextInt();
	
		String p2Class = "";
		
		switch(p2Choice)
		{
		case 1: p2Class = "Biology"; 
		break;
		
		case 2: p2Class = "Algebra";
		break;
		
		case 3: p2Class = "English";
		break;
		}
		
		System.out.println("What is the students grade in "+p2Class);
		String p2Grade = userInput.next();
		
		System.out.println("What is the students third period?");
		System.out.println("1) Biology");
		System.out.println("2) Algebra");
		System.out.println("3) English");
		int p3Choice = userInput.nextInt();
		String p3Class = "";
		
		switch(p3Choice)
		{
		case 1: p3Class = "Biology"; 
		break;
		
		case 2: p3Class = "Algebra";
		break;
		
		case 3: p3Class = "English";
		break;
		}	
		
		System.out.println("What is the students grade in "+p3Class);
		String p3Grade = userInput.next();
		
		importFile.studentList.add(new Student(fn, ln,p1Class,p1Grade, p2Class, p2Grade,p3Class,p3Grade));
		
		System.out.println( fn + ln + " has been added");
		System.out.println("Welcome to class");
	}
	
}