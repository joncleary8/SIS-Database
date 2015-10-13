import java.util.Scanner;
import java.util.ArrayList;

public class ChangeClass
	{
		public static void runChangeClass()
			{
				printStudents();
			}
		public static void printStudents()
			{
				for(int c = 0; c < importFile.studentList.size(); c++)
					System.out.println((c+1) + ") " + importFile.studentList.get(c).getFirstName() + " " + importFile.studentList.get(c).getLastName());
			}
	}
