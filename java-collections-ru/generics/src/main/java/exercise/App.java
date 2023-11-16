package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> inputBook) {
        List<Map<String, String>> outputList = new ArrayList<>();

        for (Map<String, String> book : books) {
            if (isEqual(book, inputBook)) {
                outputList.add(book);
            }
        }
        return outputList;
    }

    private static boolean isEqual(Map<String, String> map, Map<String, String> sample) {
        for (String key : sample.keySet()) {
            if (!map.get(key).equals(sample.get(key))) {
                return false;
            }
        }
        return true;
    }
}
//END
