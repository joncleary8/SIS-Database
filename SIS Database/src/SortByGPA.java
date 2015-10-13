import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class SortByGPA
	{
		public double compare(Student g1 , Student g2)
		{
			 if (g1.getGPA()>g2.getGPA())
				 return 1;
			 else
				 return -1;
		}
	}
