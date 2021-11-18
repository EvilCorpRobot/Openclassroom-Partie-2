package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {
	private static int headacheCount = 0;	// initialize to 0
	private static int rashCount = 0;		// initialize to 0
	private static int pupilCount = 0;		// initialize to 0
	
	public static void main(String args[]) throws Exception {
		// first get input
		ReadSymptomDataFromFile file = new ReadSymptomDataFromFile("symptoms.txt");
		HashMap<String, Integer> results = file.GetSymptoms();
		Map<String, Integer> treeMap = new TreeMap<String, Integer>(results);


		FileWriter writer = new FileWriter ("result.out");
		for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
			writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
		}
		writer.close();
	}
}
