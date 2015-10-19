import java.util.Comparator;

public class SortByPeriodOne implements Comparator<Student>
	{
		public int compare(Student o1, Student o2)
		{
			return (o1.getFirstPeriod().compareTo(o2.getFirstPeriod()));
		}
	}
