package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String inputString) {
        Map<String, Integer> outputMap = new HashMap<>();

        if (inputString.isEmpty()) {
            return outputMap;
        }

        String[] words = inputString.split("\\s+");

        for (String word : words) {
            int count = outputMap.getOrDefault(word, 0);
            outputMap.put(word, count + 1);
        }
        
        return outputMap;
    }

    public static String toString(Map<String, Integer> inputMap) {
        if (inputMap.isEmpty()) {
            return "{}";
        }

        StringBuilder outputString = new StringBuilder();

        outputString.append("{\n");
        for (String key : inputMap.keySet()) {
            outputString.append("  ").append(key).append(": ").append(inputMap.get(key)).append("\n");
        }
        outputString.append("}");

        return outputString.toString();
    }
}
//END
