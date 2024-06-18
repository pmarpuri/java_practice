package org.pmarpuri.java8.flatMap.mapFlatMap;

import java.util.List;

public class Institute {
	String name;
    
    List<String> locations;
     
    public Institute(String name, List<String> locations) 
    {
        this.name = name;
        this.locations = locations;
    }
     
    public String getName() 
    {
        return name;
    }
     
    public List<String> getLocations()
    {
        return locations;
    }
}

