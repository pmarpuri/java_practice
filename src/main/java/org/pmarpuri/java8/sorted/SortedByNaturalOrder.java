package org.pmarpuri.java8.sorted;
//https://javaconceptoftheday.com/java-8-streams-beginners-guide/

import java.util.ArrayList;
import java.util.List;

public class SortedByNaturalOrder {
  public static void main(String[] args) {
	
	  List<String> names = new ArrayList<>();
		names.add("David");
		names.add("Johnson");
		names.add("Samontika");
		names.add("Brijesh");
		names.add("John");
		
		names.stream().sorted().forEach(System.out::println);
}
}
