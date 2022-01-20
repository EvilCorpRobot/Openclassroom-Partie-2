package com.hemebiotech.analytics;
import java.util.List;
/**
 * @author Theo Conte
 *ISymptomReader interface
 */
public interface ISymptomReader {
    /**
     * reads a file and puts it in a list, ISymptomReader is the readSymptomDataFromFile inteface
     * @author Theo Conte
     * @return List of Symptoms
     */
    List<String> getSymptoms ();

}
