package mate.academy.rickandmorty.repository;

import java.util.List;
import mate.academy.rickandmorty.model.LocalCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<LocalCharacter, Long> {
    List<LocalCharacter> findAllByNameContainingIgnoreCase(String name);
}
