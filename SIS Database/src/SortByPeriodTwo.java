import java.util.Comparator;

public class SortByPeriodTwo implements Comparator<Student>
	{
		public int compare(Student t1, Student t2)
		{
			return (t1.getSecondPeriod().compareTo(t2.getSecondPeriod()));
		}
	}
