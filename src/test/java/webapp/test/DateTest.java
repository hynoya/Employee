package webapp.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import webapp.escape.Background;
import webapp.escape.Screen;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DateTest {
	static Log log = LogFactory.getLog(DateTest.class);

	@Test
	public void test1() {
		Date current = new Date();
		log.info(current.toLocaleString());
	}
	
	@Test
	public void test2() {
		Calendar current = Calendar.getInstance();
		
		log.info(current.getTime().toLocaleString());
		
	}
	
	@Test
	public void test3() {
		Date current = new Date();
		
		current.setDate(current.getDate() + 100);
		log.info("year = " + (current.getYear() + 1900));
		log.info("month = " + (current.getMonth() + 1));
		log.info("date = " + current.getDate());
		log.info("week = " + current.getDay());
	}
	
	@Test
	public void test4() {
		Date date = new Date(2015 - 1900, 3-1, 1);
			
		log.info("start week = " + date.getDay());
		
		int month = date.getMonth();
		while(true) {
			date.setDate(date.getDate() + 1);
			
			if (month != date.getMonth()) 
				break;
		}
		date.setDate(date.getDate() - 1);
		log.info("end week = " + date.getDay());
		log.info("end date = " + date.getDate());
		log.info(date.toLocaleString());
		
	}
	
	@Test
	public void test5() {
		int year = 2015;
		int month = 2;
		int start = 0;
		int end = 0;
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		sDay.set(year, month-1, 1);
		
		eDay.set(year, month, 1);
		eDay.add(Calendar.DATE, -1);
		
		start = sDay.get(Calendar.DAY_OF_WEEK);
		end = eDay.get(Calendar.DATE);
		
		System.out.println("   " + year + "년" + month + "월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		for(int i=1 ; i<start ; i++) {
			System.out.print("   ");
		}
		
		for(int i=1, n=start ; i <= end ; i++, n++ ) {
			System.out.print((i<end)?" " + i: "" + i);
			if(n%7==0)
				System.out.println();
		}
	}
				
	

 	@Test
 	public void test6() {
 		Screen.clear();
 		
 		
 		Scanner scan = new Scanner(System.in);
 		
		while (true) {
			Screen.cursorPosition(5, 1);
	 		System.out.println("[yyyy/MM] : ");
 			String param = scan.nextLine();
 			
 			if(param.equals("."))
 				break;
 			System.out.println("param = " + param);
 		}
 		
 		//Screen.reset();	
 		}
 	}



