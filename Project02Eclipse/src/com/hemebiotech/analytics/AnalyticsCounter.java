package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	private ISymptomReader file = new ReadSymptomDataFromFile("symptoms.txt");
	private ISymptomCounter counter = new DefaultSymptomCounter();
	private ISymptomWriter writer = new WriteSymptomToFile("results.out");



	public List<String> getSymptoms() {
		return this.file.getSymptoms();
	}


	public Map<String, Integer> count(List<String> list) {
		return counter.count(list);
	}

	public void write(Map<String, Integer> map) {
		writer.write(map);
	}

	public static void main(String args[]) throws Exception {
		AnalyticsCounter analyticsCounter = new AnalyticsCounter();
		List<String> list = analyticsCounter.getSymptoms();
		Map<String, Integer> map = analyticsCounter.count(list);
		analyticsCounter.write(map);
	}
}
