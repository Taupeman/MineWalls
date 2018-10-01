package fr.taupeman.minewalls.Kits;

public enum KitsEnum {
    Alchimiste("Alchimiste"),
    AlchimsteFou("Alchimiste fou"),
    Archer("Archer"),
    Buildeur("Buildeur"),
    Combat("Combat"),
    Creeper("Creeper"),
    Defenseur("Défenseur"),
    Redsotneur("Redstoneur");

    private String nameKit;

    KitsEnum(String name) {
        this.nameKit = name;
    }

    public String getNameKit() {
        return nameKit;
    }
}
