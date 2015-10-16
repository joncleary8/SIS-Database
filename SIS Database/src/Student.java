
public class Student
	{
		private String firstName;
		private String lastName;
		private String firstPeriod;
		private String firstPeriodGrade;
		private String secondPeriod;
		private String secondPeriodGrade;
		private String thirdPeriod;
		private  String thirdPeriodGrade;
		private double GPA;
		public Student(String fN,String lN, String fP, String fG, String sP, String sG, String tP, String tG)
			{
				firstName = fN;
				lastName = lN;
				firstPeriod = fP;
				firstPeriodGrade = fG;
				secondPeriod = sP;
				secondPeriodGrade = sG;
				thirdPeriod = tP;
				thirdPeriodGrade = tG;
			}
		
		
		public String getFirstName()
			{
				return firstName;
			}
		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}
		public String getLastName()
			{
				return lastName;
			}
		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}
		public String getFirstPeriod()
			{
				return firstPeriod;
			}
		public void setFirstPeriod(String firstPeriod)
			{
				this.firstPeriod = firstPeriod;
			}
		public String getFirstPeriodGrade()
			{
				return firstPeriodGrade;
			}
		public void setFirstPeriodGrade(String firstPeriodGrade)
			{
				this.firstPeriodGrade = firstPeriodGrade;
			}
		public String getSecondPeriod()
			{
				return secondPeriod;
			}
		public void setSecondPeriod(String secondPeriod)
			{
				this.secondPeriod = secondPeriod;
			}
		public String getSecondPeriodGrade()
			{
				return secondPeriodGrade;
			}
		public void setSecondPeriodGrade(String secondPeriodGrade)
			{
				this.secondPeriodGrade = secondPeriodGrade;
			}
		public String getThirdPeriod()
			{
				return thirdPeriod;
			}
		public void setThirdPeriod(String thirdPeriod)
			{
				this.thirdPeriod = thirdPeriod;
			}
		public String getThirdPeriodGrade()
			{
				return thirdPeriodGrade;
			}
		public void setThirdPeriodGrade(String thirdPeriodGrade)
			{
				this.thirdPeriodGrade = thirdPeriodGrade;
			}
		public double getGPA()
			{
				return GPA;
			}
		public void setGPA(double gPA)
			{
				GPA = gPA;
			}

	}
