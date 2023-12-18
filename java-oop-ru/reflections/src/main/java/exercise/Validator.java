package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class Validator {
    public static List<String> validate(Address address) {
        List<String> defectiveFields = new ArrayList<>();
        var declaredFields = address.getClass().getDeclaredFields();

        for (Field field : declaredFields) {
            var notNull = field.getAnnotation(NotNull.class);
            try {
                field.setAccessible(true);
                if (notNull != null && field.get(address) == null) {
                    defectiveFields.add(field.getName());
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        return defectiveFields;
    }
}
// END
