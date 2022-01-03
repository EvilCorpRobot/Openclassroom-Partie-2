package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DefaultSymptomCounter implements ISymptomCounter{
    /**
     *Take the list and convert it to a map this class has for ISymptomCounter interface
     * @author Theo Conte
     * @param list
     * @return Map of Symptoms
     */
    @Override
    public Map<String, Integer> count(List<String> list) {
        // Create a treeMap
        Map<String, Integer> result = new TreeMap<>();
        // iterate the list
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
