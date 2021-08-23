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
    public int createCharacter(@RequestBody Character character) {
        Characters.list.add(character);
        return character.getId();
    }

    @PutMapping("/characters")
    public Character updateCharacter(@RequestBody Character newCharacter) {
        {
            for (Character character : Characters.list) {
                if (character.getId() == newCharacter.getId()) {
                    Characters.list.set(Characters.list.indexOf(character), newCharacter);
                    return newCharacter;
                }
            }
            return null;
        }
    }

    @DeleteMapping("/characters/{id}")
    public boolean deleteCharacter(@PathVariable(name = "id") int id) {
        return Characters.list.removeIf(character -> character.getId() == id);
    }
}
