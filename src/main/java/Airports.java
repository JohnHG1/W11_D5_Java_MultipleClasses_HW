public enum Airports {

    GLA("Glasgow"),
    EDI("Edinburgh"),
    BEL("Belfast"),
    GTW("Gatwick");

    private final String name;

    Airports(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}