package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class Java8DateExamples {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		LocalTime lt  = LocalTime.now();
		System.out.println(lt);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		System.out.println("----");
		LocalDate ld1 = LocalDate.of(2025, 9, 3);
		System.out.println(ld1);
		System.out.println("date format");
		LocalDateTime ldt1 = LocalDateTime.now();
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String customFormat = ldt1.format(formatDate);
		System.out.println(customFormat);
		System.out.println("-------------");
		ZonedDateTime zdt1=  ZonedDateTime.now();
		System.out.println(zdt1);
		System.out.println("display all time zones");
		Set<String> ss = ZoneId.getAvailableZoneIds();
		ss.stream().forEach(v->System.out.println(v));
		
		// US/Central
		ZonedDateTime zdt2=  ZonedDateTime.now(ZoneId.of("US/Central"));
		System.out.println(zdt2);
	}

}
