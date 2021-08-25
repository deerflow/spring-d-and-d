package app.characters;

import java.util.ArrayList;
import java.util.List;

public class Characters {
    private static final List<Character> list = new ArrayList<>(
        List.of(
            new Character(1, "Ficelle", CharacterType.Mage, 11),
            new Character(2, "Mozzarella", CharacterType.Warrior, 25),
            new Character(3, "Caccio Cavallo", CharacterType.Mage, 19)
        )
    );

    public static List<Character> findAll() {
        return Characters.list;
    }

    public static Character findById(int id) {
        for (Character character : Characters.list) {
            if (character.getId() == id) return character;
        }
        return null;
    }

    public static int createOne(Character character) {
        Characters.list.add(character);
        return character.getId();
    }

    public static boolean deleteOne(int id) {
        return Characters.list.removeIf(character -> character.getId() == id);
    }

    public static boolean editOne(int id, Character character) {
        for (Character oldCharacter : Characters.list) {
            if (oldCharacter.getId().equals(id)) {
                Characters.list.set(Characters.list.indexOf(oldCharacter), character);
                return true;
            }
        }
        return false;
    }
}
