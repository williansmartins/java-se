package com.williansmartins.x.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TrabalhandoComDate {
	public static void main(String[] args) throws ParseException {
		// Convert Date to String.
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String date = sdf.format(new Date());
		System.out.println(date); // 15/10/2013

		// Convert String to Date.
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "08-07-1982 10:20:56";
		Date date2 = sdf2.parse(dateInString);
		System.out.println(date2); // Tue Aug 31 10:20:56 SGT 1982

		// Get current date time
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date3 = new Date();
		System.out.println(dateFormat.format(date3)); // 2013/10/15 16:16:39

		// Convert Calendar to Date
		Calendar calendar = Calendar.getInstance();
		Date date4 = calendar.getTime();

		// como comparar datas?

		//
	}
}