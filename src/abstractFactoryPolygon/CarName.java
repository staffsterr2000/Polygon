package abstractFactoryPolygon;

public enum CarName {
    HONDA("Honda"),
    LADA("Lada"),
    NISSAN("Nissan"),
    BENTLEY("Bentley");

    private final String simpleName;
    public String getSimpleName() {
        return simpleName;
    }
    CarName(String simpleName) {
        this.simpleName = simpleName;
    }
}
