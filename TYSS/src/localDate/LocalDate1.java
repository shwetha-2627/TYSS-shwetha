package localDate;

import java.time.LocalDate;

public class LocalDate1 {
public static void main(String [] args) {
	System.out.println("current date:"+LocalDate.now());
	System.out.println("current day:"+LocalDate.now().getDayOfMonth());
	System.out.println("current month:"+LocalDate.now().getMonth());
	System.out.println("current year:"+LocalDate.now().getYear());
	//int eDay = LocalDate.now().getDayOfMonth();
	//System.out.println(eDay);
	//demo
	
	
}
}
