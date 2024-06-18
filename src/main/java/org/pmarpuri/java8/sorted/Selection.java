package org.pmarpuri.java8.sorted;
//https://javaconceptoftheday.com/java-8-streams-beginners-guide/

import java.util.ArrayList;
import java.util.List;

public class Selection {

	public static void main(String[] args) {
		//Selecting names containing more than 5 characters
		List<String> names = new ArrayList<>();
		names.add("David");
		names.add("Johnson");
		names.add("Samontika");
		names.add("Brijesh");
		names.add("John");
		names.add("David");
		names.add("Brijesh");
		
		names.stream().filter(name -> name.length()>5).forEach(System.out::println);
		System.out.println("Select Only uniueq element--------------==================");
		//Selecting only unique names
		names.stream().distinct().forEach(System.out::println);
		
		
	}
}
