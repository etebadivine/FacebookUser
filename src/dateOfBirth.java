import java.util.Calendar;

public class dateOfBirth {
	
		private int dayBorn;
		private  int monthBorn;
		private int yearBorn;
		
		
		public int getDayBorn() {
			return dayBorn;
		}
		public boolean setDayBorn(int day) {
			dayBorn = day;
			if(dayBorn > 31) 
			{
				System.out.println("Day must be less than 31");
				return false;
				} else {
					return true;
				}
		}
		public int getMonthBorn() {
			return monthBorn;
		}
		public boolean setMonthBorn(int month) {
			monthBorn = month;
			if(monthBorn > 12) {
				System.out.println("month must be less than 12");
				return false;}
			else {
				return true;
					}
		}
		public int getYearBorn() {
			return yearBorn;
		}
		public boolean setYearBorn(int year) {
			yearBorn = year;
		 if(yearBorn < 1970) {
				System.out.println("Year must not be less than 1970");
				return false;}
		    else {
		    	return true;
		    }
	
			
			
			
		}
	    public int getAge() {
			Calendar cal = Calendar.getInstance();
			int year = cal.get(Calendar.YEAR);
			return year-yearBorn;
				
			}
			
			  

}
