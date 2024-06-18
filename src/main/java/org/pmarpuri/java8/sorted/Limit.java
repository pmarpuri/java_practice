package org.pmarpuri.java8.sorted;
//https://javaconceptoftheday.com/java-8-streams-beginners-guide/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Limit {
public static void main(String[] args) {
	List<String> names = new ArrayList<>();
	names.add("David");
	names.add("Johnson");
	names.add("Samontika");
	names.add("Brijesh");
	names.add("John");
	
	//Storing first 3 names in a mutable container 
	
	List<String> nameList = names.stream().limit(3).collect(Collectors.toList());
	System.out.println(nameList);
	
}
}
