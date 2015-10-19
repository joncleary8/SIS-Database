import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class SortByGPA implements Comparator<Student>
	{
		public int compare(Student g1 , Student g2)
		{
			 if (g1.getGPA()<g2.getGPA())
				 return 1;
			 else
				 return -1;
		}

		public static void printStudentsInfo()
			{
				for(int c = 0; c < importFile.studentList.size(); c++)
					{
						System.out.print((c+1) + ") ");
						System.out.print(importFile.studentList.get(c).getFirstName());
						System.out.print(" " + importFile.studentList.get(c).getLastName());
						System.out.print(" // " + importFile.studentList.get(c).getGPA());
						System.out.print(" // " + importFile.studentList.get(c).getFirstPeriod());
						System.out.print(" " + importFile.studentList.get(c).getFirstPeriodGrade());
						System.out.print(" // " + importFile.studentList.get(c).getSecondPeriod());
						System.out.print(" " + importFile.studentList.get(c).getSecondPeriodGrade());
						System.out.print(" // " + importFile.studentList.get(c).getThirdPeriod());
						System.out.println(" " + importFile.studentList.get(c).getThirdPeriodGrade());
						
					}
			}
		public static void calculateGPA(int x)
		{
			int grade=0;
			switch(importFile.studentList.get(x).getFirstPeriodGrade().substring(0,1))
			{
				case "A":
					grade+=4;
					break;
				case "B":
					grade+=3;
					break;
				case "C":
					grade+=2;
					break;
				case "D":
					grade+=1;
					break;
				default:
					grade+=0;
					break;
			}
			switch(importFile.studentList.get(x).getSecondPeriodGrade().substring(0,1))
			{
				case "A":
					grade+=4;
					break;
				case "B":
					grade+=3;
					break;
				case "C":
					grade+=2;
					break;
				case "D":
					grade+=1;
					break;
				default:
					grade+=0;
					break;
			}
			switch(importFile.studentList.get(x).getThirdPeriodGrade().substring(0,1))
			{
				case "A":
					grade+=4;
					break;
				case "B":
					grade+=3;
					break;
				case "C":
					grade+=2;
					break;
				case "D":
					grade+=1;
					break;
				default:
					grade+=0;
					break;
			}
			grade*=100;
			grade/=3;
			double GPA = (double)grade/100;
			importFile.studentList.get(x).setGPA(GPA);

			
			
			
		}
	}
