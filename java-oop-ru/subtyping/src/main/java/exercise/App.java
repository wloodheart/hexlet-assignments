package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static void swapKeyValue(KeyValueStorage keyValueStorage) {
        var srcMap = new HashMap<>(keyValueStorage.toMap());

        for (var key : srcMap.keySet()) {
            var val = srcMap.get(key);

            keyValueStorage.unset(key);
            keyValueStorage.set(val, key);
        }
    }
}
// END
