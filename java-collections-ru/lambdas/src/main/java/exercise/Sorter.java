package exercise;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        return users.stream()
                .filter(u -> u.get("gender").equals("male"))
                .sorted(Comparator.comparing(u -> u.get("birthday")))
                .map(u -> u.get("name"))
                .collect(Collectors.toList());
    }
}
// END
