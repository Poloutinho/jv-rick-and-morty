package mate.academy.rickandmorty.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseDto {
    private Long id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
}
