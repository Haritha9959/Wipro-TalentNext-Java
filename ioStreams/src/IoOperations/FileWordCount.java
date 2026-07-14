package IoOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class FileWordCount {

    public static void main(String[] args) {

        // Check command-line arguments
        if (args.length != 2) {
            System.out.println("Usage: java IoOperations.FileWordCount inputFile.txt outputFile.txt");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        TreeMap<String, Integer> wordCount = new TreeMap<>();

        try {
        	BufferedReader br = new BufferedReader(
        		    new FileReader("D:\\wiproTalentnext\\wipro-master\\praticing pgms\\inputFile.txt"));

        		FileWriter fw = new FileWriter(
        		    "D:\\wiproTalentnext\\wipro-master\\praticing pgms\\outputFile.txt");
            String line;

            while ((line = br.readLine()) != null) {

                String[] words = line.split("\\s+");

                for (String word : words) {

                    // Remove punctuation
                    word = word.replaceAll("[^a-zA-Z0-9]", "");

                    if (!word.isEmpty()) {

                        if (wordCount.containsKey(word)) {
                            wordCount.put(word, wordCount.get(word) + 1);
                        } else {
                            wordCount.put(word, 1);
                        }
                    }
                }
            }

            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                bw.write(entry.getKey() + " : " + entry.getValue());
                bw.newLine();
            }

            bw.close();

            System.out.println("Word count written successfully to " + outputFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}