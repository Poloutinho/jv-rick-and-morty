package mate.academy.rickandmorty.service;

import java.util.List;
import mate.academy.rickandmorty.dto.CharacterDto;
import mate.academy.rickandmorty.model.LocalCharacter;

public interface CharacterService {
    LocalCharacter getRandomCharacter();

    List<CharacterDto> findByNamePart(String namePart);
}
