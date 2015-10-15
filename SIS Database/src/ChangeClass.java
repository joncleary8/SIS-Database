import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class ChangeClass
	{
		private static Scanner userInput = new Scanner(System.in);
		private static int studentNum;
		private static ArrayList<String> studentClass = new ArrayList<String>();
		private static int i;
		private static int classNum[] = new int[2];
		public static void runChangeClass() throws IOException
			{
				System.out.println("Which student would you like to change?");
				printStudents();
				System.out.println((importFile.studentList.size() + 1) + ") Go Back");
				int userInputInt = userInput.nextInt() - 1;
				if(userInputInt < 0 || userInputInt > importFile.studentList.size())
					runChangeClass();
				else
					{
						studentNum = userInputInt;
						if(studentNum == importFile.studentList.size())
							SISrunner.subMenuChangeStudent();
						else
							{
								for(i = 0; i < 2; i++)
									askClass();
								for(i = 0; i < 2; i++)
									changeClass();
								System.out.println("Here is " + importFile.studentList.get(studentNum).getFirstName() + "'s new schedule. ");
								printClasses();
							}
					}
			}
		public static void printStudents()
			{
				for(int c = 0; c < importFile.studentList.size(); c++)
					System.out.println((c+1) + ") " + importFile.studentList.get(c).getFirstName() + " " + importFile.studentList.get(c).getLastName());
			}
		public static void askClass() throws IOException
			{
				if(i == 0)
					System.out.println("Which one of " + importFile.studentList.get(studentNum).getFirstName() + "'s class would you like to switch? ");
				else
					System.out.println("What class would you like to switch it with? ");
				printClasses();
				System.out.println("// (4) Go Back.");
				classNum[i] = userInput.nextInt();
				switch(classNum[i])
					{
								case 1:
									studentClass.add(importFile.studentList.get(studentNum).getFirstPeriod());
									studentClass.add(importFile.studentList.get(studentNum).getFirstPeriodGrade());
									break;
								case 2:
									studentClass.add(importFile.studentList.get(studentNum).getSecondPeriod());
									studentClass.add(importFile.studentList.get(studentNum).getSecondPeriodGrade());
									break;
								case 3:
									studentClass.add(importFile.studentList.get(studentNum).getThirdPeriod());
									studentClass.add(importFile.studentList.get(studentNum).getThirdPeriodGrade());
									break;
								case 4:
									studentClass.removeAll(studentClass);
									runChangeClass();
									break;
								default:
									System.out.println("Please choose a valid option.");
									i--;
									askClass();
									break;
					}
			}
		public static void changeClass()
			{
				switch(classNum[i])
					{
							case 1:
								importFile.studentList.get(studentNum).setFirstPeriod(studentClass.get(studentClass.size() - 2));
								importFile.studentList.get(studentNum).setFirstPeriodGrade(studentClass.get(studentClass.size() - 1));
								break;
							case 2:
								importFile.studentList.get(studentNum).setSecondPeriod(studentClass.get(studentClass.size() - 2));
								importFile.studentList.get(studentNum).setSecondPeriodGrade(studentClass.get(studentClass.size() - 1));
								break;
							case 3:
								importFile.studentList.get(studentNum).setThirdPeriod(studentClass.get(studentClass.size() - 2));
								importFile.studentList.get(studentNum).setThirdPeriodGrade(studentClass.get(studentClass.size() - 1));
								break;
					}
				for(int j = 0; j < 2; j++)
					studentClass.remove(studentClass.size() - 1);
			}
		public static void printClasses()
			{
				System.out.print("// (1) "+importFile.studentList.get(studentNum).getFirstPeriod()+" "+importFile.studentList.get(studentNum).getFirstPeriodGrade()+" //");
				System.out.print(" (2) "+importFile.studentList.get(studentNum).getSecondPeriod()+" "+importFile.studentList.get(studentNum).getSecondPeriodGrade()+" //");
				System.out.print(" (3) "+importFile.studentList.get(studentNum).getThirdPeriod()+" "+importFile.studentList.get(studentNum).getThirdPeriodGrade()+" //");

			}
	}
