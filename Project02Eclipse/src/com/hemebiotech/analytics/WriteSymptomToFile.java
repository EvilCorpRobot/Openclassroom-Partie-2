package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WriteSymptomToFile {
    Map<String, Integer> treeMap;

    /**
     *
     * @param filename to file path
     * @param hashmap of all symptoms
     */
    public WriteSymptomToFile (String filename, HashMap<String, Integer> hashmap) {
        this.treeMap = new TreeMap<String, Integer>(hashmap);
    }

    /**
     * write and sort the hashmap
     */
    public void write() {
        FileWriter writer = null;
        try {
            writer = new FileWriter("results.out");
            for (Map.Entry<String, Integer> entry : this.treeMap.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
