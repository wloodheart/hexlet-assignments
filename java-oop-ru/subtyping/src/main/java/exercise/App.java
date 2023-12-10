package exercise;

import java.util.Map;

// BEGIN
class App {
    public static void swapKeyValue(KeyValueStorage keyValueStorage) {
        var srcMap = Map.copyOf(keyValueStorage.toMap());

        for (var key : srcMap.keySet()) {
            var val = srcMap.get(key);

            keyValueStorage.unset(key);
            keyValueStorage.set(val, key);
        }
    }
}
// END
