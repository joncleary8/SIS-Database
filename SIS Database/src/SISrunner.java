import java.io.IOException;
import java.util.Scanner;

public class SISrunner
	{
		static int mainChoice;
		static int secondChoice;
		public static void main(String[] args) throws IOException
			{
				importFile.fillStudentList();
				mainMenu();


			}
		
		
		public static void subMenuAddAndDelete() throws IOException
		{
			Scanner secondaryInput = new Scanner(System.in);
			
			System.out.println("What would you like to do?");
			System.out.println("1) Add a student");
			System.out.println("2) Delete a student");
			System.out.println("3) Return to main menu");
			
			secondChoice = secondaryInput.nextInt();
			
			switch(secondChoice)
			{
				case 1:
				//Run the add student class
					break;
				case 2:
				//Run the delete student class
					break;
				case 3:
					mainMenu();
					break;
				default: subMenuAddAndDelete();
					break;
			}
		}
		
		public static void subMenuChangeStudent() throws IOException
		{
			
			Scanner secondaryInput = new Scanner(System.in);
			
			System.out.println("What would you like to do?");
			System.out.println("1) Change a grade");
			System.out.println("2) Change a schedule");
			System.out.println("3) Return to the main menu");
			
			secondChoice = secondaryInput.nextInt();
			
			switch(secondChoice)
			{
				case 1:
					ChangeGrade.changeGradeRun();
					break;
				case 2:
					ChangeClass.runChangeClass();
					break;
				case 3:
					mainMenu();
					break;
				default: subMenuChangeStudent();
			}
		}
		
		public static void subMenuSortStudents() throws IOException
		{
			Scanner secondaryInput = new Scanner(System.in);
			
			System.out.println("What would you like to do?");
			System.out.println("1) Sort by last name");
			System.out.println("2) Sort by GPA");
			System.out.println("3) Sort by class");
			System.out.println("4) Return to the main menu");
			
			secondChoice = secondaryInput.nextInt();
			
			switch(secondChoice)
			{
				case 1:	
					//Run the sort last name class
					break;
				case 2:
					//Run the sort GPA class
					break;
				case 3:
					//Run the sort class class
					break;
				case 4:
					mainMenu();
					break;
				default: subMenuSortStudents();
			}
		}
		public static void mainMenu() throws IOException
		{
			Scanner mainInput = new Scanner(System.in);
			System.out.println("What would you like to do?");
			System.out.println("1) Add or delete a student");
			System.out.println("2) Change students grade or schedule");
			System.out.println("3) Sort students");
			mainChoice = mainInput.nextInt();
			switch(mainChoice)
			{
				case 1:
					subMenuAddAndDelete();
					break;
				case 2:
					subMenuChangeStudent();
					break;
				case 3:
					subMenuSortStudents();
					break;
				default: mainMenu();
				
			}
			
		}

	}
