package jodatime;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class DateTimeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stubF
		DateTime currentDateTime = new DateTime(); //DateTime class is used to get the date, time and timezone.
		
		System.out.println(currentDateTime);
		
		/*
		 * toString can be used to print date and time in a specific format.
		 * 'HH' to print the hours in 24-hour format.
		 * 'hh' to print the hours in 12-hour format.
		 * 'MM' to print Month.
		 * 'mm' to print minutes.
		 * 'a' to print display AM/PM.
		 * 'ss'to print seconds.
		 * 'SSS' to print milli-second.
		 * 'E' to print day in the week.
		 */		
		System.out.println(currentDateTime.toString("dd/MM/yyy"));
		
		System.out.println(currentDateTime.toString("HH:mm:ss"));
		System.out.println(currentDateTime.toString("hh:mm:ss:SSS a E")); 
		
		
		System.out.println("\nCreating a object for a perticular Timezone.");
		DateTime changedTimeZone = new DateTime();
		changedTimeZone = DateTime.now(DateTimeZone.forID("America/Chicago"));
		System.out.println("Time in Chicago, US: " + changedTimeZone.toString("hh:mm:ss:SSS a E")); 
		// The changed time-zone is only for the particular object.
		
		
		DateTimeZone.setDefault(DateTimeZone.UTC);
		System.out.println(DateTimeZone.getAvailableIDs());
		//DateTimeZone.getAvailableIDs();
		DateTime obj = new DateTime(); 
		System.out.println(obj.toString("hh:mm:ss:SSS a E")); 
		
		System.out.println(currentDateTime.toString("hh:mm:ss:SSS a E")); 
		
		
	}
}
