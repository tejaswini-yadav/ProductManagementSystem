package com.yash.pms.test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String[] args)
	{
		List<Integer> list= Arrays.asList(-2,-4, 0, 4, 8,5);
		//List<Integer> list1=Arrays.asList(-2, (1, -4), 0, (9 ,4), 8,5);
		
		//list.stream().map(x->x*x).sorted(Comparator.comparingInt(Integer::intValue)).forEach(e->System.out.println(e));
	
	SimpleDateFormat sf=new SimpleDateFormat("dd");
	//sf.getT
	String s1="2023-07-12";
	String a = "12 July 2023";
	String b = "15 Aug 2023";
	//Timestamp ts= new Timestamp.format(Instant.now());
	
	//LocalDate ld=new LocalDate();
	
	
	/*List<List<Integer>> listOfLists = List.of(
			List.of(-2),
			List.of(1, 4),
			List.of(8),
			List.of(9, 4),
			List.of(6),
			List.of(5)
			);*/
	//listOfLists.stream().map(s->Arrays.asList(s)).forEach(s->System.out.println(s));
	//listOfLists.stream().map(x->x*x).forEach(e->System.out.println(e));
	
	//listOfLists.stream().forEach(x->x.stream().map(e->e*e).sorted(Comparator.comparingInt(Integer::intValue)).forEach(e->System.out.println(e)));
	//listOfLists.stream().forEach(x->x.stream().map(e->e*e).forEach(s->System.out.println(s)));
	
	}
}
//number 