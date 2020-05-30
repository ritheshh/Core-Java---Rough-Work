package jodatime;

import org.joda.time.DateTime;

public class CustomDateTimeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTime customDT = new DateTime("2017-10-23T09:30:00.123");
		System.out.println(customDT.toString("hh:mm:ss:SSS a E"));
		
		
		//DateTime can also be stored in a String and parsed.
		String dateTime= "2020-10-23T23:59:58.123";
		customDT = DateTime.parse(dateTime);
		System.out.println(customDT.toString("hh:mm:ss:SSS a E"));

	}

}
