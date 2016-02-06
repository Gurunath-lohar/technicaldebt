package testmongo.javamongo;

import java.util.Date;

public class TestDate {
	public static void main(String [] args) {
		Date date = new Date();
		Long time = date.getTime();
		System.out.println("date :"+date);
		System.out.println("time :"+time);
	}
}