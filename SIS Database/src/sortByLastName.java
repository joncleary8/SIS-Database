import java.util.ArrayList;
import java.util.Comparator;

public class sortByLastName implements Comparator <Student>
	{
		public int compare (Student ln1, Student ln2)
		{
			return (ln1.getLastName().compareTo(ln2.getLastName()));
		}
	}
