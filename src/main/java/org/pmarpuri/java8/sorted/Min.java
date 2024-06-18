package org.pmarpuri.java8.sorted;
//https://javaconceptoftheday.com/java-8-streams-beginners-guide/

import java.util.Arrays;
import java.util.OptionalInt;

public class Min {
  public static void main(String[] args) {
	 int[] ar = new int[] {7,5,9,2,8,1}; 
	  
	//OptionalInt min = Arrays.stream(new int[] {7,5,9,2,8,1}).min();
	 OptionalInt min = Arrays.stream(ar).min();
	 System.out.println("min-> " + min);
	 
	 OptionalInt m = Arrays.stream(ar).min();
	 
	 //max
	 OptionalInt max = Arrays.stream(ar).max();
	 
	 System.out.println("max -> "  + max);
}
}
