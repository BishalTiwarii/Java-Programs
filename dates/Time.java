package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time {

	public static void main(String[] args) {
	LocalDate now=LocalDate.now();
	System.out.println(now); //printing todays date
	
	LocalTime time=LocalTime.now();
	System.out.println(time);//printing  current time
	
	LocalDateTime dt=LocalDateTime.now();
	System.out.println(dt);//printing both today date and time as well
	
    boolean isLeap=now.isLeapYear();
  
    System.out.println(isLeap);
   
	}

}
