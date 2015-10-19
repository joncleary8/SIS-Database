import java.util.Comparator;

public class SortByPeriodThree implements Comparator<Student>
	{
		public int compare(Student f1, Student f2)
		{
			return (f1.getThirdPeriod().compareTo(f2.getThirdPeriod()));
		}
	}
