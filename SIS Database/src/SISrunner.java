import java.io.IOException;
import java.util.Scanner;
import java.util.Collections;

public class SIISrunner
	{
		static int mainChoice;
		static int secondChoice;
		public static void main(String[] args) throws IOException
			{
				
				importFile.fillStudentList();
				setGPA();
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
				AddStudent.addStudentRun();
				subMenuAddAndDelete();
					break;
				case 2:
				RemoveStudent.deleteStudentRun();
				subMenuAddAndDelete();
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
					Collections.sort(importFile.studentList, new sortByLastName());
					SortByGPA.printStudentsInfo();
					System.out.println();
					mainMenu();
					break;
				case 2:
					Collections.sort(importFile.studentList, new SortByGPA());
					SortByGPA.printStudentsInfo();
					System.out.println();
					mainMenu();
					break;
				case 3:
					subSubMenuSortClass();
					System.out.println();
					mainMenu();
					break;
				case 4:
					mainMenu();
					break;
				default: subMenuSortStudents();
			}
		}
		
		
		public static void subSubMenuSortClass() throws IOException
		{
			int thirdChoice;
			Scanner terceryInput = new Scanner(System.in);	
			System.out.println("Which class would you like to sort by?");
			System.out.println("1) First period");
			System.out.println("2) Second period");
			System.out.println("3) Third period");
			System.out.println("4) Return to main menu");
			thirdChoice = terceryInput.nextInt();
			
			switch(thirdChoice)
			{
			
				case 1:
					Collections.sort(importFile.studentList, new SortByPeriodOne());
					break;
				case 2:
					Collections.sort(importFile.studentList, new SortByPeriodTwo());
					break;
				case 3:
					Collections.sort(importFile.studentList, new SortByPeriodThree());
					break;
				case 4:mainMenu();
					break;
 			}
			SortByGPA.printStudentsInfo();
		
		
		}
		
		
		
		public static void mainMenu() throws IOException
		{
			Scanner mainInput = new Scanner(System.in);
			System.out.println("What would you like to do?");
			System.out.println("1) Add or delete a student");
			System.out.println("2) Change students grade or schedule");
			System.out.println("3) Sort students");
			System.out.println("4) Finished Working. End Program");
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
				case 4:
					break;
				default: mainMenu();
				
			}
			
		}
		public static void setGPA()
		{
			for(int i=0; i<importFile.studentList.size();i++)
				SortByGPA.calculateGPA(i);
		}
		public static void printGPA()
		{
			for(int i=0; i<importFile.studentList.size();i++)
				System.out.println(importFile.studentList.get(i).getFirstName() + " " + importFile.studentList.get(i).getLastName() + " " + importFile.studentList.get(i).getGPA());
		}

	}
