package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomToFile implements ISymptomWriter{
    private String filename;
    /**
     * @param filename to file path
     */
    public WriteSymptomToFile (String filename) {
        this.filename = filename;
    }

    /**
     * write and sort the map this class has for ISymptomWriter interface
     */
    @Override
    public void write(Map<String, Integer> map) {
        // created the file with the filename attribute
        try (FileWriter writer = new FileWriter(this.filename)) {

            // iterate the map to entry and write the key and value to the output file
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
