package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
class Tag {
    private String tagName;
    private Map<String, String> attributes;

    public Tag(String tagName, Map<String, String> attributes) {
        this.tagName = tagName;
        this.attributes = attributes;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("<").append(tagName);

        for (String key : attributes.keySet()) {
            stringBuilder.append(String.format(" %1$s=\"%2$s\"", key, attributes.get(key)));
        }

        stringBuilder.append(">");

        return stringBuilder.toString();
    }
}
// END
