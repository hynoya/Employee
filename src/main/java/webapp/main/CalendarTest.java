package webapp.main;

import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

import webapp.escape.Screen;

public class CalendarTest {

	public static void printCalendar(int year, int month) {
		Screen.cursorPosition(3, 5);
		System.out.println("year = " + year + ", month = " + month);
		
		Date date = new Date(year - 1900, month - 1, 1);

		int mon = date.getMonth();
		int startDay = date.getDay();

		while (true) {
			date.setDate(date.getDate() + 1);
			if (mon != date.getMonth())
				break;
		}

		date.setDate(date.getDate() - 1);
		int lastDay = date.getDate();

		date.setDate(1);
		if (startDay != 0)
			date.setDate(date.getDate() - startDay);
		else
			date.setDate(date.getDate() - 7);

		System.out.println("==========" + month + "월 달력===========");
		System.out.println("Sun. Mon. Tue. Wed. Thu. Fri. Sat.");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (date.getDate() <= 9)
					System.out.print("0" + date.getDate() + "  ");
				else
					System.out.print(date.getDate() + "  ");
				date.setDate(date.getDate() + 1);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Screen.clear();
		Scanner scanner = new Scanner(System.in);

		while (true) {

			boolean flag;
			String param = "";
			do {
				flag = true;
				Screen.cursorPosition(20, 1);
				System.out.print("[yyyy/MM] : ");
				param = scanner.nextLine();
				Screen.clear();
				System.out.println("param = " + param);

				flag = param.matches("[1-9][0-9]{3}/[0-1][0-9]");
			} while (!flag);
			
			StringTokenizer tokens = new StringTokenizer(param, "/");
			
			int year = Integer.parseInt((String)tokens.nextElement()); 
			int month = Integer.parseInt((String)tokens.nextElement());
			
			if (month > 0 && month < 13)
				printCalendar(year, month);
		}
	}

}
