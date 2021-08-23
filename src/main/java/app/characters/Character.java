package app.characters;

public class Character {
    private final int id;
    private String name;
    private CharacterType type;
    private int lifePoints;

    Character(int id, String name, CharacterType type, int lifePoints) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.lifePoints = lifePoints;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }
}
