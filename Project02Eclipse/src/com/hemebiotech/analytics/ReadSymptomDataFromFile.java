package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	/**
	 * @author Theo Conte
	 * @param filepath of the file
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}

	/**
	 * reads a file and puts it in a list, ISymptomReader is the readSymptomDataFromFile inteface
	 * @author Theo Conte
	 * @return List of Symptoms
	 */
	@Override
	public List<String> getSymptoms() {

		List<String> result = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader (new FileReader(filepath))) {
				String line = reader.readLine();
				// reads line by line is added to the list
				while (line != null) {

					result.add(line);
					line = reader.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		
		return result;
	}

}
