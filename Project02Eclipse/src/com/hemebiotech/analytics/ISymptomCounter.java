package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Theo Conte
 *ISymptomCounter interface
 */
public interface ISymptomCounter {

    public Map<String, Integer> count(List<String> list);
}
