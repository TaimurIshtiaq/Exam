package lab;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/** Contains code for lab final.
 * @author Taimur
*/
public class Lab {
	
	static Date today = new Date();
	
	/**
	 * This method converts fahrenheit temperature to centrigrade
	 * @author Taimur
	 * @param fahrenheit takes fahrenheit value
	 * @return returns centigrade equivalent
	 * */
	public static int fahrenheitToCentigrade(int fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}
	
	/**
	 * This method converts centrigrade temperature to fahrenheit
	 * @author Taimur
	 * @param centigrade takes centigrade value
	 * @return returns fahrenheit equivalent
	 * */
	public static int centigradeToFahrenheit(int centigrade) {
		return centigrade * 9 / 5 + 32;
	}
	
	/**
	 * This method removes sign of exclamation from a string input
	 * @author Taimur
	 * @param in takes a string value
	 * @return returns a string without any exclamation marks
	 * */
	public static String removeSignOfExclaimation(String in){
		if(in==null||in.length()==0)
			return in;
		return in.replaceAll("!", "");
	}
	
	/**
	 * This method gets the current day
	 * @author Taimur
	 * @return returns the current day as integer
	 * */
	public static int getCurrentDay(){
		LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localDate.getDayOfMonth();
	}
	
	/**
	 * This method gets the current month
	 * @author Taimur
	 * @return returns the current month as integer
	 * */
	public static int getCurrentMonth(){
		LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localDate.getMonthValue();
	}
	
	/**
	 * This method gets the current year
	 * @author Taimur
	 * @return returns the current year as integer
	 * */
	public static int getCurrentYear(){
		LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localDate.getYear();
	}
}
