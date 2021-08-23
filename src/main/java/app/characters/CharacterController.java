package app.characters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CharacterController {
    @GetMapping("/characters")
    public List<Character> index() {
        return new ArrayList<>(List.of(
                new Character(1, "Girouette", CharacterType.Mage, 11),
                new Character(2, "Pizza", CharacterType.Warrior, 25),
                new Character(3, "Plouk", CharacterType.Warrior, 19)
        ));
    }
}
