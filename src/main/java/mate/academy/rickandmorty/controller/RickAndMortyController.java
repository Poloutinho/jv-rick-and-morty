package mate.academy.rickandmorty.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import lombok.RequiredArgsConstructor;
import mate.academy.rickandmorty.dto.CharacterDto;
import mate.academy.rickandmorty.model.LocalCharacter;
import mate.academy.rickandmorty.service.CharacterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/characters")
@Tag(name = "Rick and Morty management")
public class RickAndMortyController {
    private final CharacterService characterService;

    @GetMapping("/random")
    public LocalCharacter getRandom() {
        return characterService.getRandomCharacter();
    }

    @GetMapping("/by-name")
    public List<CharacterDto> getCharacter(@RequestParam String namePart) {
        return characterService.findByNamePart(namePart);
    }
}
