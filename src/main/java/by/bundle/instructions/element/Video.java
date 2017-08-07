package by.bundle.instructions.element;

import javax.validation.constraints.NotNull;

public class Video extends Element {

    @NotNull
    private String src;

    public Video(String src) {
        this.src = src;
        setType(Types.VIDEO);
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }
}
