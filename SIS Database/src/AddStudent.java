import java.util.ArrayList;
import java.util.Scanner;

public class AddStudent 
{
	public static void addStudentRun()
	{
		ArrayList<String> classes = new ArrayList<String>();
		classes.add("Biology");
		classes.add("English");
		classes.add("Algebra");
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What is the first name of the student");
		String fn = userInput.nextLine();
		System.out.println("What is the last name of the student");
		String ln = userInput.nextLine();
		System.out.println("What is the students first period?");
		for(int i = 0; i < classes.size(); i++)
			{
				System.out.println((i + 1) + ") " + classes.get(i));
			}
		int p1Choice = userInput.nextInt();
		String p1Class = "";
		switch(p1Choice)
		{
		case 1: p1Class = classes.get(0); 
		classes.remove(0);
		break;
		
		case 2: p1Class = classes.get(1);
		classes.remove(1);
		break;
		
		case 3: p1Class = classes.get(2);
		classes.remove(2);
		break;
		}	
		
		System.out.println("What is the students grade in "+p1Class);
		String p1Grade = userInput.next().toUpperCase();
		
		System.out.println("What is the students second period?");
		for(int i = 0; i < classes.size(); i++)
			{
				System.out.println((i + 1) + ") " + classes.get(i));
			}
		int p2Choice = userInput.nextInt();
	
		String p2Class = "";
		
		switch(p2Choice)
		{
		case 1: p2Class = classes.get(0); 
		classes.remove(0);
		break;
		
		case 2: p2Class = classes.get(1);
		classes.remove(1);
		break;
		}
		
		System.out.println("What is the students grade in "+p2Class);
		String p2Grade = userInput.next().toUpperCase();
		
		String p3Class = classes.get(0);
		System.out.println("Third period: "+p3Class);
		System.out.println("What is the students grade in "+p3Class);
		String p3Grade = userInput.next().toUpperCase();
		
		importFile.studentList.add(new Student(fn, ln,p1Class,p1Grade, p2Class, p2Grade,p3Class,p3Grade));
		
		SortByGPA.calculateGPA(importFile.studentList.size()-1);
		SortByGPA.printStudentsInfo();
		System.out.println();
	}
	
}