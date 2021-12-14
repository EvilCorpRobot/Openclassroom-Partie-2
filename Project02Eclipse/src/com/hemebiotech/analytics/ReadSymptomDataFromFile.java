package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile {

	private String filepath;
	
	/**
	 * 
	 * @param filepath of the file
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}

	/**
	 *	read file
	 * @return hashmap of all symptoms and their numbers
	 */
	public HashMap<String, Integer> GetSymptoms() {
		HashMap<String, Integer> result = new HashMap<>();
		
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					if (result.containsKey(line)) {
						result.replace(line, (result.get(line) + 1));
					} else {
						result.put(line, 1);
					}
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
