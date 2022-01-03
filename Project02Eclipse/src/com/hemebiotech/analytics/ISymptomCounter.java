package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ISymptomCounter {

    public Map<String, Integer> count(List<String> list);
}
