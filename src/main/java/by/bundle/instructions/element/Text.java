package by.bundle.instructions.element;

import javax.validation.constraints.NotNull;

public class Text extends Element {

    @NotNull
    private String text;

    public Text(String text) {
        this.text = text;
        setType(Types.TEXT);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
