package ch17;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class QX29 {

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2017, Month.JULY, 17);
		LocalTime time = LocalTime.of(10, 0);
		ZoneId zone = ZoneId.of("America/New_York");
		ZonedDateTime iceCreamDay = ZonedDateTime.of(date, time, zone);
		// time = time.plusMonths(1); // compile error
		System.out.println(iceCreamDay.getMonthValue());
	}
}
