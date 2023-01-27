package rcosta.com.adoptionservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnimalDto {

    private Integer id;

    private String provisionalName;

    private Integer estimatedAge;

    private String typeOfAnimal;

    private String breed;

    private Date entryDate;

    private Date dateOfAdoption;

    private String arrivalConditions;

    private String nameOfWhoReceived;

    private Date dateOfDeath;

    private String portOfAnimal;
}
