package app.characters;

import java.util.ArrayList;
import java.util.List;

public class Characters {

    public static List<Character> list = new ArrayList<>(
            List.of(
                    new Character(1, "Girouette", "Mage", 11),
                    new Character(2, "Pizza", "Warrior", 25),
                    new Character(3, "Plouk", "Warrior", 19)
            )
    );
}
