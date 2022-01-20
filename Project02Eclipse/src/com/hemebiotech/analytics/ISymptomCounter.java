package com.hemebiotech.analytics;
import java.util.List;
import java.util.Map;

/**
 * @author Theo Conte
 *ISymptomCounter interface
 */
public interface ISymptomCounter {

    /**
     *Take the list and convert it to a map this class has for ISymptomCounter interface
     * @author Theo Conte
     * @param list
     * @return Map of Symptoms
     */
    public Map<String, Integer> count(List<String> list);
}
