package by.bundle.instructions.element;

import javax.validation.constraints.NotNull;

public class Image extends Element{

    @NotNull
    private String src;

    public Image(String src) {
        setType(Types.IMAGE);
        this.src = src;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }
}
