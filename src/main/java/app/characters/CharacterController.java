package app.characters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CharacterController {
    private List<Character> characters;

    CharacterController() {
        this.characters = List.of(
                new Character(1, "Girouette", CharacterType.Mage, 11),
                new Character(2, "Pizza", CharacterType.Warrior, 25),
                new Character(3, "Plouk", CharacterType.Warrior, 19)
        );
    }

    @GetMapping("/characters")
    public List<Character> index() {
        return characters;
    }

    @GetMapping("/characters/{id}")
    public Character getCharacterById(@PathVariable(value = "id") int id) {
        for (Character character : characters) {
            if (character.getId() == id) {
                return character;
            }
        }
        return null;
    }
}
