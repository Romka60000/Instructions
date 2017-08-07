package by.bundle.instructions.element;

public abstract class Element {
    private Types type;

    public enum Types {
        VIDEO, IMAGE, TEXT;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }
}
