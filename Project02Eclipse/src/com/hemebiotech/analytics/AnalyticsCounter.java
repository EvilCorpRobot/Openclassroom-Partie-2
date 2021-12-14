package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		// first get input
		ReadSymptomDataFromFile file = new ReadSymptomDataFromFile("symptoms.txt");
		HashMap<String, Integer> results = file.GetSymptoms();
		WriteSymptomToFile file_out = new WriteSymptomToFile("results.out", results);
		file_out.write();
	}
}
