package org.pmarpuri.java8.flatMap.mapFlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//https://www.javadevjournal.com/java/java-difference-between-map-and-flatmap/
public class Map {

	
	public static void main(String[] args) {
		 List<Institute> instituteList = new ArrayList<>();
         
      instituteList.add(new Institute("IIM", Arrays.asList("Bangalore", "Ahmedabad", "Kozhikode", "Lucknow")));
      instituteList.add(new Institute("IIT", Arrays.asList("Delhi", "Mumbai", "Kharagpur")));
      instituteList.add(new Institute("NIFT", Arrays.asList("Hyderabad", "Mumbai", "Patna", "Bangalore")));
     
    //Java 8 Map() : Get names of all institutes
      
      List<String> nameOfinst = instituteList.stream().map(inst -> inst.getName()).collect(Collectors.toList());
      
      List<String> nameofInst = (List<String>)instituteList.stream().map(inst -> inst.getName()).collect(Collectors.toList());
		System.out.println("nameofInst : " +nameofInst);
		
	//Java 8 FlatMap() : Get unique locations of all institutes
		Set<String> locationsOfInstitutes1 = instituteList.stream().flatMap(inst -> inst.getLocations().stream()).collect(Collectors.toSet());
	  Set<String> locationsOfInstitutes =  instituteList.stream().flatMap(inst -> inst.getLocations().stream()).collect(Collectors.toSet());
	  System.out.println("locationsOfInstitutes : " +locationsOfInstitutes);
	}
	
	    
}
