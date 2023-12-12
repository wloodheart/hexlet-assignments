package exercise;

// BEGIN
class LabelTag implements TagInterface {
    private String value;
    private TagInterface tag;

    public LabelTag() {
    }

    public LabelTag(String value, TagInterface tag) {
        this.value = value;
        this.tag = tag;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TagInterface getTag() {
        return tag;
    }

    public void setTag(TagInterface tag) {
        this.tag = tag;
    }

    @Override
    public String render() {
        return "<label>" + value + tag.render() + "</label>";
    }
}
// END
