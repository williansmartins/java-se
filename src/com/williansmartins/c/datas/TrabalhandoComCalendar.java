package com.williansmartins.c.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TrabalhandoComCalendar {
	public static void main(String[] args) throws ParseException {
		// Get current date time
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar calendar = new GregorianCalendar(2013, 0, 31);
		System.out.println(sdf.format(calendar.getTime()));

		// Simple Calendar example
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar calendar2 = new GregorianCalendar(2013, 1, 28, 13, 24, 56);

		int year = calendar2.get(Calendar.YEAR);
		int month = calendar2.get(Calendar.MONTH); // Jan = 0, dec = 11
		int dayOfMonth = calendar2.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = calendar2.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendar2.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth = calendar2.get(Calendar.WEEK_OF_MONTH);

		int hour = calendar2.get(Calendar.HOUR); // 12 hour clock
		int hourOfDay = calendar2.get(Calendar.HOUR_OF_DAY); // 24 hour clock
		int minute = calendar2.get(Calendar.MINUTE);
		int second = calendar2.get(Calendar.SECOND);
		int millisecond = calendar2.get(Calendar.MILLISECOND);

		System.out.println(sdf2.format(calendar2.getTime()));

		System.out.println("year \t\t: " + year);
		System.out.println("month \t\t: " + month);
		System.out.println("dayOfMonth \t: " + dayOfMonth);
		System.out.println("dayOfWeek \t: " + dayOfWeek);
		System.out.println("weekOfYear \t: " + weekOfYear);
		System.out.println("weekOfMonth \t: " + weekOfMonth);

		System.out.println("hour \t\t: " + hour);
		System.out.println("hourOfDay \t: " + hourOfDay);
		System.out.println("minute \t\t: " + minute);
		System.out.println("second \t\t: " + second);
		System.out.println("millisecond \t: " + millisecond);

		// Set a date manually.
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");

		Calendar calendar3 = new GregorianCalendar(2013, 1, 28, 13, 24, 56);
		System.out.println("#1. " + sdf3.format(calendar3.getTime()));
		// update a date
		calendar3.set(Calendar.YEAR, 2014);
		calendar3.set(Calendar.MONTH, 11);
		calendar3.set(Calendar.MINUTE, 33);
		System.out.println("#2. " + sdf3.format(calendar3.getTime()));

		// Add or subtract from a date.
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy MMM dd");

		Calendar calendar4 = new GregorianCalendar(2013, 10, 28);
		System.out.println("Date : " + sdf4.format(calendar4.getTime()));

		// add one month
		calendar4.add(Calendar.MONTH, 1);
		System.out.println("Date : " + sdf4.format(calendar4.getTime()));

		// subtract 10 days
		calendar4.add(Calendar.DAY_OF_MONTH, -10);
		System.out.println("Date : " + sdf4.format(calendar4.getTime()));

		// Convert Date to Calendar.
		SimpleDateFormat sdf5 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "22-01-2015 10:20:56";
		Date date = sdf5.parse(dateInString);

		Calendar calendar5 = Calendar.getInstance();
		calendar5.setTime(date);
	}
}