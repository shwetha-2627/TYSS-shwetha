package localDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateManupulation {
	public static void main(String [] args) {
		System.out.println("current date:"+LocalDate.now());
		System.out.println(" date after 2 months:"+LocalDate.now().plusMonths(2));
		System.out.println(" date after 4 year:"+LocalDate.now().plusYears(4));
		System.out.println(" date after 20 days:"+LocalDate.now().plusDays(20));
		System.out.println(" date before 2 months:"+LocalDate.now().minusMonths(2));
		System.out.println(" date before 4 year:"+LocalDate.now().minusYears(4));
		System.out.println(" date before 20 days:"+LocalDate.now().minusDays(20));
		
		System.out.println("Total no. of days in year :"+LocalDate.now().lengthOfYear());
		LocalDate d = LocalDate.parse("Feb 5,2019", DateTimeFormatter.ofPattern("MMM d,yyyy"));
		System.out.println(d);
		
		
	}

}
