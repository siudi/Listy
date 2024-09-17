package pl.gornik.library;

public enum Genre {
    HORROR("horror"),
    FANTASY("fantastyke"),
    CRIME("kryminał"),
    THRILLER("triller"),
    BIOGRAPHY("biografia"),
    NOVEL("powieść");
    private String name;

    Genre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
