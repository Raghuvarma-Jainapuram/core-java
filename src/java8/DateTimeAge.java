package java8;

import java.util.Scanner;
//import java.time.*;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;

public class DateTimeAge {

	public static void main(String[] args) {
		
		// Current Time
		LocalTime todayTime = LocalTime.now();
		System.out.println("Current Time: "+todayTime);
		
		// Specified Time
		LocalTime specificTime = LocalTime.of(12,20,25,40);
		System.out.println("Specific Time: "+specificTime);
		
		// Current Date
		LocalDate todayDate = LocalDate.now();
		System.out.println("Current Date: "+todayDate);
		
		// Specified Date
		LocalDate specificDate = LocalDate.of(2014, 03, 21);
		System.out.println("Specific Date1: "+specificDate);
		
		LocalDate firstDay_2023 = LocalDate.of(2023, Month.JANUARY, 1);
		System.out.println("Specific Date2="+firstDay_2023);
		
		// Current DateTime
		LocalDateTime todateDateTime = LocalDateTime.now();
		System.out.println("Current Date and Time: "+todateDateTime);

		// Specific DataTime
		LocalDateTime specificDateTime = LocalDateTime.of(2022, Month.JULY, 27, 01, 50, 25);
		System.out.println("Specific Data and Time: "+specificDateTime);
		
		// Today Kolkata
		LocalDateTime todayKolkata = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Date in IST: "+todayKolkata);
		
		// Age calculate
		Scanner sc = new Scanner(System.in);
        System.out.println("\n* Please enter your date of birth in yyyy-mm-dd format only *");
        String st = sc.nextLine();
        
        LocalDate Dob;
        Dob = LocalDate.parse(st);    
        
        System.out.println("Your Age is : "+calcAge(Dob));
        sc.close();
    }
    
    static int calcAge(LocalDate Dob)
    {
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(Dob,currentDate).getYears();
        return age;
	}

}
