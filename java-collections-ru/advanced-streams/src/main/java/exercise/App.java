package exercise;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// BEGIN
class App {
    public static String getForwardedVariables(String data) {
        return Stream.of(data.split("\n"))
                .filter(a -> a.startsWith("environment="))
                .map(s -> s.replaceAll("environment=", "")
                        .replaceAll("\"", "")
                        .replaceAll("\\s+", ""))
                .flatMap(e -> Stream.of(e.split(",")))
                .filter(s -> s.startsWith("X_FORWARDED_"))
                .map(s -> s.replaceAll("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
    }
}
//END
