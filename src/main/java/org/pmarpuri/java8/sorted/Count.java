package org.pmarpuri.java8.sorted;
//https://javaconceptoftheday.com/java-8-streams-beginners-guide/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Count {
	 
public static void main(String[] args) {
	List<String> names = new ArrayList<>();
	names.add("David");
	names.add("Johnson");
	names.add("Samontika");
	names.add("Brijesh");
	names.add("John");
	
	//Counting the names with length > 5
	System.out.println("Counting the names with length > 5");
	long count = names.stream().filter(name -> name.length()>5).count();
	System.out.println("count ->" +count);
	
	
	//Selecting names containing more than 5 characters
	System.out.println("Selecting names containing more than 5 characters");
	names.stream().filter(n -> n.length() >5).forEach(System.out::println);
	
	//Selecting first 4 names
	System.out.println("Selecting first 4 names");
	names.stream().limit(4).forEach(System.out::println);
	
	System.out.println("//Returns length of each name");
	names.stream().map(String :: length).forEach(System.out::println);
	
	System.out.println("//Sorting the names according to natural order");
	names.stream().sorted().forEach(System.out::println);
	
	//sorted(Comparator) : Sorting according to supplied comparator
	//Method Signature : Stream<T> sorted(Comparator<T> comparator)
   //Type Of Operation : Intermediate Operation
	//Sorting the names according to their length
	System.out.println("//Sorting the names according to their length");
	names.stream().sorted((n1 , n2) -> n1.length() - n2.length()).forEach(System.out::println);
	
	//max() : Finding the maximum
	//Type Of Operation : Terminal Operation
	System.out.println("It returns maximum element in a stream wrapped in an Optional object.");
	int[] ar = new int[]{1,2,3,4,5,6,7};
	OptionalInt max = Arrays.stream(ar).max();
	System.out.println("max::" + max);

	//count() : Counting the elements
	//Method Signature : long count()
	//Type Of Operation : Terminal Operation
	//Returns the number of elements in a stream.
	//Counting the names with length > 5
	
	long longnum = names.stream().filter(n -> n.length() > 5).count();
	System.out.println("names with length ->" + longnum);
	
	//collect() : Returns mutable container
	
}		
}
















