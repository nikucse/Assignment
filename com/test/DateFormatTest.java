package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;

public class DateFormatTest {


		public static void main(String[] args) {
			
			DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			try {
				Date today = sdf.parse("03/07/2020");
				DateFormat sdf1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.getDefault());
				System.out.println("Format Date : "+sdf1.format(today));

			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
	
}
