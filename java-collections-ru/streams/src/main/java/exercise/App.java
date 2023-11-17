package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        List<String> freeDomains = List.of(
                "gmail.com",
                "yandex.ru",
                "hotmail.com"
        );

        return emails.stream()
                .filter(s -> !s.isBlank())
                .filter(s -> freeDomains.contains(s.split("@")[1]))
                .count();
    }
}
// END
