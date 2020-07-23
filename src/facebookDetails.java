import java.util.Scanner;


public class facebookDetails {

	public static void main(String[] args) {
		String name;
	    int year;
	    int day;
	    int month;
	    String email;
		int tellNum;
		
		User facebook = new User();
		dateOfBirth birthDate = new dateOfBirth();
		Scanner s = new Scanner(System.in);
		System.out.println("UserName");
		name= s.next();
		
		// yyyy-mm-dd = 1990-09-21
		boolean checkDay;
		boolean checkMonth;
		boolean checkYear;
		
		
		do {
		System.out.println("Date of Birth (yyyy-mm-dd)");
		
        String dob = s.next();
        String[] arr = dob.split("-");
        
        
		 checkDay   = birthDate.setDayBorn(Integer.parseInt(arr[2]));
		 checkMonth = birthDate.setMonthBorn(Integer.parseInt(arr[1]));
		 checkYear  = birthDate.setYearBorn(Integer.parseInt(arr[0]));
		 }
		  while
			  (checkDay == false ||checkMonth == false||checkYear == false); {
		 // System.exit(1);
			
		}
//        System.out.println("Day of Birth");
//        Day = get.nextInt();
//        
//        System.out.println("Year of Birth");
//        Year = get.nextInt();
//        
        
        System.out.println("email Address");
		email = s.next();
		
		System.out.println("Telephone Number");
		tellNum = s.nextInt();
	   
		facebook.setName(name);
		facebook.setEmail(email);
		facebook.setTellNum(tellNum);
		
		
		int age = birthDate.getAge();
		System.out.println("Age is " + age);
		}
		
	}

	



      
    	   
  
       
    	   
    	   
       
