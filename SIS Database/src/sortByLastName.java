import java.util.ArrayList;

public class sortByLastName
	{
		private static int i = 0;
		private static ArrayList<Student> tempStudentList = new ArrayList<Student>();
		public static void sortByLastNameRun()
			{
				for(int i = 0; i < importFile.studentList.size() - 1; i++)
					{
						int sorter = compareNames(importFile.studentList.get(i), importFile.studentList.get(i + 1));
						System.out.println(sorter);
							
					}
			}
		public static int compareNames(Student g1 , Student g2)
			{
				char nameFirst = 65, nameSecond = 65;
				if(g1.getLastName().equals(g2.getLastName()))
					{
						nameFirst = g1.getFirstName().charAt(i);
						nameSecond = g2.getFirstName().charAt(i);
					}
				else
					{
						if(g2.getLastName().length() > g1.getLastName().length() && g1.getLastName().equals(g2.getLastName().substring(0, g1.getLastName().length())))
							return -1;
						else if(g1.getLastName().length() > g2.getLastName().length() && g2.getLastName().equals(g1.getLastName().substring(0, g2.getLastName().length())))
							return 1;
						nameFirst = g1.getLastName().charAt(i);
						nameSecond = g2.getLastName().charAt(i);
					}
				if(nameFirst > nameSecond)
					{
						i = 0;
						return -1;
					}
				else if(nameFirst < nameSecond)
					{
						i = 0;
						return 1;
					}
				else if(nameFirst == nameSecond)
					{
						i++;
						return compareNames(g1, g2);
					}
				else
					return 1;
			}
	}
