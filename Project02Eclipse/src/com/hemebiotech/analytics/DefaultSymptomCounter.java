package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DefaultSymptomCounter implements ISymptomCounter{

    @Override
    public Map<String, Integer> count(List<String> list) {
        // Create a treeMap to sort alphabetically
        Map<String, Integer> result = new TreeMap<>();
        for (String s : list) {
            // if in the list the character string is contained in the Map then that adds more 1
            if (result.containsKey(s)) {
                result.replace(s, (result.get(s) + 1));
                // else add the line to the map
            } else {
                result.put(s, 1);
            }
        }
        return result;
    }
}
