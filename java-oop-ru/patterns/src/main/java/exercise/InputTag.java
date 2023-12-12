package exercise;

import javax.swing.*;

// BEGIN
class InputTag implements TagInterface {
    private String type;
    private String value;

    public InputTag() {
    }

    public InputTag(String type, String value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public String render() {
        return "<input type=\"" + type + "\" value=\"" + value + "\">";
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
// END
