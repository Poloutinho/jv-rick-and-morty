package mate.academy.rickandmorty.mapper;

import mate.academy.rickandmorty.config.MapperConfig;
import mate.academy.rickandmorty.dto.CharacterDto;
import mate.academy.rickandmorty.dto.ResponseDto;
import mate.academy.rickandmorty.model.LocalCharacter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = MapperConfig.class)
public interface CharacterMapper {
    @Mapping(source = "externalId", target = "id")
    LocalCharacter toModel(ResponseDto apiResponseDto);

    CharacterDto toDto(LocalCharacter character);
}
