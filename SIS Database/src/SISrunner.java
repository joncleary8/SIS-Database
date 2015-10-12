import java.io.IOException;

public class SISrunner
	{

		public static void main(String[] args) throws IOException
			{
				importFile.fillStudentList();
				System.out.println(importFile.studentList.get(0).getFirstName());

			}

	}
