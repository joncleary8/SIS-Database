
public class Student
	{
		private String firstName;
		private String lastName;
		private String firstPeriod;
		private static String firstPeriodGrade;
		private String secondPeriod;
		private static String secondPeriodGrade;
		private String thirdPeriod;
		private static String thirdPeriodGrade;
		private static double GPA;
		public Student(String fN,String lN, String fP, String fG, String sP, String sG, String tP, String tG, double g)
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
		public static void calculateGPA()
			{
				double firstGradeValue = 0.0, secondGradeValue = 0.0, thirdGradeValue = 0.0;
				if (firstPeriodGrade.substring(0,1).equals("A"))
					{
						firstGradeValue= 4.0;
					}
				else if (firstPeriodGrade.substring(0,1).equals("B"))
					{
						firstGradeValue= 3.0;
					}
				else if (firstPeriodGrade.substring(0,1).equals("C"))
					{
						firstGradeValue= 2.0;
					}
				else if (firstPeriodGrade.substring(0,1).equals("D"))
					{
						firstGradeValue= 1.0;
					}
				else
					{
						firstGradeValue= 0.0;
					}
				if (secondPeriodGrade.substring(0,1).equals("A"))
					{
						secondGradeValue= 4.0;
					}
				else if (secondPeriodGrade.substring(0,1).equals("B"))
					{
						secondGradeValue= 3.0;
					}
				else if (secondPeriodGrade.substring(0,1).equals("C"))
					{
						secondGradeValue= 2.0;
					}
				else if (secondPeriodGrade.substring(0,1).equals("D"))
					{
						secondGradeValue= 1.0;
					}
				else
					{
						secondGradeValue= 0.0;
					}
				if (thirdPeriodGrade.substring(0,1).equals("A"))
					{
						thirdGradeValue= 4.0;
					}
				else if (thirdPeriodGrade.substring(0,1).equals("B"))
					{
						thirdGradeValue= 3.0;
					}
				else if (thirdPeriodGrade.substring(0,1).equals("C"))
					{
						thirdGradeValue= 2.0;
					}
				else if (thirdPeriodGrade.substring(0,1).equals("D"))
					{
						thirdGradeValue= 1.0;
					}
				else
					{
						thirdGradeValue= 0.0;
					}
				int temporary= (int)((firstGradeValue + secondGradeValue + thirdGradeValue)/3)*100;
				GPA = (double)temporary/100.0;
				
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
