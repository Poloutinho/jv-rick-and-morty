package mate.academy.rickandmorty.service;

import java.util.List;
import java.util.Random;
import lombok.RequiredArgsConstructor;
import mate.academy.rickandmorty.dto.CharacterDto;
import mate.academy.rickandmorty.mapper.CharacterMapper;
import mate.academy.rickandmorty.model.LocalCharacter;
import mate.academy.rickandmorty.repository.CharacterRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharacterServiceImpl implements CharacterService {
    private final CharacterRepository characterRepository;
    private final Random random;
    private final CharacterMapper characterMapper;

    @Override
    public LocalCharacter getRandomCharacter() {
        long charactersAmount = characterRepository.count();
        long id = random.nextLong(charactersAmount);
        return characterRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Character not found with id: " + id));
    }

    @Override
    public List<CharacterDto> findByNamePart(String namePart) {
        return characterRepository.findAllByNameContainingIgnoreCase(namePart).stream()
                .map(characterMapper::toDto)
                .toList();
    }
}
