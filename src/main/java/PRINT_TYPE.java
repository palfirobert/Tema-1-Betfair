public enum PRINT_TYPE {
    COLOR(true),
    BLACK_AND_WHITE(false);

    private final Boolean type;

    PRINT_TYPE(Boolean b) {
        this.type = b;
    }

    public Boolean getType() {
        return type;
    }
}
