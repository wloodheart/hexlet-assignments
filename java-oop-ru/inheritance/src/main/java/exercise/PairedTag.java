package exercise;

import java.util.Map;
import java.util.List;

// BEGIN
class PairedTag extends Tag {
    private String tagBody;
    private List<Tag> tags;

    public String getTagBody() {
        return tagBody;
    }

    public void setTagBody(String tagBody) {
        this.tagBody = tagBody;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public PairedTag(String tagName, Map<String, String> attributes, String tagBody, List<Tag> tags) {
        super(tagName, attributes);
        this.tagBody = tagBody;
        this.tags = tags;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(super.toString());

        for (Tag tag : tags) {
            stringBuilder.append(tag.toString());
        }

        stringBuilder.append(tagBody);
        stringBuilder.append(String.format("</%1$s>", super.getTagName()));

        return stringBuilder.toString();
    }
}
// END
