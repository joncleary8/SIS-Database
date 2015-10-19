import java.util.ArrayList;

public class sortByLastName
	{
		private static ArrayList<Student> tempStudentList = new ArrayList<Student>();
		public static void sortByLastNameRun()
			{
				sortNames();
				ChangeClass.printStudents();
			}
		public static void sortNames()
			{
				int r = 0;
				int s = 1;
				while(s < importFile.studentList.size())
					{
						for(int i = s; i < importFile.studentList.size() - 1; i++)
							{
								int sorter = compareNames(importFile.studentList.get(r), importFile.studentList.get(i));
								System.out.println(sorter);
								if(sorter == -1)
									{
										Student latter = importFile.studentList.get(r);
										Student former = importFile.studentList.get(i);
										importFile.studentList.set(r, former);
										importFile.studentList.set(i, latter);
										i = s;
									}
								else if(sorter == 1)
									{
								
									}
							}
						r++;
						s++;
					}
			}
		public static int compareNames(Student g1 , Student g2)
			{
				int i = 0;
				char nameFirst = 65, nameSecond = 65;
				String name[] = new String[2];
				name[0] = g1.getLastName();
				name[1] = g1.getLastName(); 
				if(name[0].equals(name[1]))
					{
						name[0] = g1.getFirstName();
						name[1] = g2.getFirstName();
					}
				else
					{
						/*if(g2.getLastName().length() > g1.getLastName().length() && g1.getLastName().equals(g2.getLastName().substring(0, g1.getLastName().length())))
							return -1;
						else if(g1.getLastName().length() > g2.getLastName().length() && g2.getLastName().equals(g1.getLastName().substring(0, g2.getLastName().length())))
							return 1;*/
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
					return 0;
			}
	}
