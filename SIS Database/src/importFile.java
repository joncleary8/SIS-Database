import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class importFile
	{
		static ArrayList <Student> studentList = new ArrayList <Student>();
		public static void fillStudentList() throws IOException
			{
				Scanner fileInput = new Scanner (new File("studentList.txt"));
				while (fileInput.hasNext())
					{
						studentList.add(new Student(fileInput.next(), fileInput.next(), fileInput.next(), fileInput.next(), fileInput.next(), fileInput.next(), fileInput.next(), fileInput.next()));
					}
			}

	}
