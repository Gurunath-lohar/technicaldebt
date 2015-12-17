package test.java.generate.pdf;

import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		long time = 15*24*3600*1000L;
		long todayTime = new Date().getTime();
		Date date = new Date(todayTime-time);
		System.out.println(date.getTime());
	}
}
