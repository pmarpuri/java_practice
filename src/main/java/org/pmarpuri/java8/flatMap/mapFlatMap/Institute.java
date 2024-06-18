package org.pmarpuri.java8.flatMap.mapFlatMap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Institute {
	String name;
    List<String> locations;
}

