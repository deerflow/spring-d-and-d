package app.characters;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CharacterController {

    @GetMapping("/characters")
    public List<Character> getCharacters(Model model) {
        return Characters.findAll();
    }

    @GetMapping("/characters/{id}")
    public Character getCharacterById(@PathVariable(value = "id") int id) {
        return Characters.findById(id);
    }

    @PostMapping("/characters")
    public int createCharacter(@RequestBody Character character) {
        return Characters.createOne(character);
    }

    @PutMapping("/characters/{id}")
    public boolean updateCharacter(@RequestBody Character character, @PathVariable(value = "id") int id) {
        return Characters.editOne(id, character);
    }

    @DeleteMapping("/characters/{id}")
    public boolean deleteCharacter(@PathVariable(name = "id") int id) {
        return Characters.deleteOne(id);
    }
}
