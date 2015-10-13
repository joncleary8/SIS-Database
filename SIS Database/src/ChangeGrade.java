import java.util.*;

public class ChangeGrade 

{
 static int studentPos;
 static int selectedClass;
 static String letterGrade;
 static String modifier;
 static String newGrade;
 static Scanner userInput = new Scanner(System.in);
	public static void changeGradeRun()
	{
		System.out.println("Which student's grade would you like to change?");
		printStudents();
		studentPos = userInput.nextInt()-1;
		selectStudent();
		selectPeriod();
		printSelectedStudent();
	}
	public static void printStudents()
	{
		for(int c = 0; c < importFile.studentList.size(); c++)
			System.out.println((c+1) + ") " + importFile.studentList.get(c).getFirstName() + " " + importFile.studentList.get(c).getLastName());
	}
	public static void selectStudent()
	{
		System.out.println(importFile.studentList.get(studentPos).getFirstName());
		System.out.println("Which grade would you like to change?");
		System.out.println();
		System.out.print("// (1) "+importFile.studentList.get(studentPos).getFirstPeriod()+" "+importFile.studentList.get(studentPos).getFirstPeriodGrade()+" //");
		
		System.out.print(" (2) "+importFile.studentList.get(studentPos).getSecondPeriod()+" "+importFile.studentList.get(studentPos).getSecondPeriodGrade()+" //");
	
		System.out.print(" (3) "+importFile.studentList.get(studentPos).getThirdPeriod()+" "+importFile.studentList.get(studentPos).getThirdPeriodGrade()+" //");
		System.out.println();
		selectedClass = userInput.nextInt();
	}
	
	public static void selectPeriod()
	
	{
		Scanner classScanner = new Scanner(System.in);
		switch(selectedClass)
		{
			case 1:
			{
			System.out.println("What letter grade would you like to change "+importFile.studentList.get(studentPos).getFirstName()+"'s "+ importFile.studentList.get(studentPos).getFirstPeriodGrade()+" in "+importFile.studentList.get(studentPos).getFirstPeriod()+" to?");
			letterGrade = classScanner.nextLine();
			letterGrade =letterGrade.toUpperCase();
			System.out.println("What modifier would you like to add? i.e. + - or nothing(just press enter)");
			modifier = classScanner.nextLine();
			newGrade = letterGrade+modifier;
			importFile.studentList.get(studentPos).setFirstPeriodGrade(newGrade);
			break;
			}
			case 2:
			{
				System.out.println("What letter grade would you like to change "+importFile.studentList.get(studentPos).getFirstName()+"'s "+ importFile.studentList.get(studentPos).getSecondPeriodGrade()+" in "+importFile.studentList.get(studentPos).getSecondPeriod()+" to?");
				letterGrade = classScanner.nextLine();
				letterGrade =letterGrade.toUpperCase();
				System.out.println("What modifier would you like to add? i.e. + - or nothing(just press enter)");
				modifier = classScanner.nextLine();
				newGrade = letterGrade+modifier;
				importFile.studentList.get(studentPos).setSecondPeriodGrade(newGrade);
				break;
			}
			case 3:
			{
				System.out.println("What letter grade would you like to change "+importFile.studentList.get(studentPos).getFirstName()+"'s "+ importFile.studentList.get(studentPos).getThirdPeriodGrade()+" in "+importFile.studentList.get(studentPos).getThirdPeriod()+" to?");
				letterGrade = classScanner.nextLine();
				letterGrade =letterGrade.toUpperCase();
				System.out.println("What modifier would you like to add? i.e. + - or nothing(just press enter)");
				modifier = classScanner.nextLine();
				newGrade = letterGrade+modifier;
				importFile.studentList.get(studentPos).setThirdPeriodGrade(newGrade);
				break;
			}
		}
		
	}
	public static void printSelectedStudent()
	{
		System.out.println(importFile.studentList.get(studentPos).getFirstName());
		System.out.print("// (1) "+importFile.studentList.get(studentPos).getFirstPeriod()+" "+importFile.studentList.get(studentPos).getFirstPeriodGrade()+" //");
		
		System.out.print(" (2) "+importFile.studentList.get(studentPos).getSecondPeriod()+" "+importFile.studentList.get(studentPos).getSecondPeriodGrade()+" //");
	
		System.out.print(" (3) "+importFile.studentList.get(studentPos).getThirdPeriod()+" "+importFile.studentList.get(studentPos).getThirdPeriodGrade()+" //");
	}
	
	
}
