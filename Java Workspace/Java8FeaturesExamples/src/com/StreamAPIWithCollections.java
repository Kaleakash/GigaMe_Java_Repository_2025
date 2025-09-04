package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIWithCollections {

	public static void main(String[] args) {
	List<String> names = new ArrayList<String>();
	names.add("Ravi");names.add("Ajay");names.add("Vikash");names.add("Mahesh");names.add("Kumar");
	names.add("Ram");names.add("Ajay");names.add("Ravi"); names.add("Mahesh");
	System.out.println(names);
	// display only those names which contains i character 
	//names.stream().filter(name->name.contains("i")).forEach(v->System.out.println(v));
	
	// display only those names end with sh character  
	//names.stream().filter(name->name.endsWith("sh")).forEach(v->System.out.println(v));
	
	// display all names in upper case  
	//names.stream().map(name->name.toUpperCase()).forEach(v->System.out.println(v));
	
	// display all names in upper case  and in sorted order 
	//names.stream().map(name->name.toUpperCase()).sorted().forEach(v->System.out.println(v));
	
	// check number of elements start with R character 
	//long numberofNames = names.stream().filter(name->name.startsWith("R")).count();
	//System.out.println(numberofNames);
	//System.out.println(names.stream().filter(name->name.startsWith("R")).count());
	
	// display only unique data 
	//names.stream().distinct().forEach(v->System.out.println(v));
	
	// skip starting few data 
	//names.stream().skip(3).forEach(v->System.out.println(v));
	
	// store result in another collection after applied one or many inter mediate  operator 
	List<String> uniqueName = names.stream().distinct().collect(Collectors.toList());
	System.out.println(uniqueName);
	
	List<String> fiveCharacterNames = names.stream().filter(n->n.length()>=5).collect(Collectors.toList());
	System.out.println(fiveCharacterNames);
	
	}

}
