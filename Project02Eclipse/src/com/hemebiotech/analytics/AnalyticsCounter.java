package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * class main which calls the other methods
 * @author Théo Conte
 */
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
		//read symptoms from a file and return a list
		List<String> list = analyticsCounter.getSymptoms();
		//take a list as a parameter and sort the list in alphabetical order, return a map
		Map<String, Integer> map = analyticsCounter.count(list);
		//take a map as a parameter and write in the output file
		analyticsCounter.write(map);
	}
}
