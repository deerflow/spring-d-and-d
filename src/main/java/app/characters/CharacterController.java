package app.characters;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CharacterController {

    @GetMapping("/characters")
    public List<Character> getCharacters() {
        return Characters.list;
    }

    @GetMapping("/characters/{id}")
    public Character getCharacterById(@PathVariable(value = "id") int id) {
        for (Character character : Characters.list) {
            if (character.getId() == id) {
                return character;
            }
        }
        return null;
    }

    @PostMapping("/characters")
    public Character createCharacter(@RequestBody Character character) {
        Characters.list.add(character);
        return character;
    }
}
