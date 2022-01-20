package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomToFile implements ISymptomWriter{
    private String filename;
    /**
     * @author Theo Conte
     * @param filename to file path
     */
    public WriteSymptomToFile (String filename) {
        this.filename = filename;
    }


    @Override
    public void write(Map<String, Integer> map) {
        try (FileWriter writer = new FileWriter(this.filename)) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
