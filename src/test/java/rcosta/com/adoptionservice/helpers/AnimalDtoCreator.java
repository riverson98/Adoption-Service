package rcosta.com.adoptionservice.helpers;

import rcosta.com.adoptionservice.dto.AnimalDto;

import java.sql.Date;
import java.util.List;

public class AnimalDtoCreator {

    private AnimalDtoCreator() {
        throw new UnsupportedOperationException("its a util class");
    }

    public static List<AnimalDto> animalDtoList(){
        var dog = AnimalDto.builder()
                .portOfAnimal("Medio")
                .breed("SRD")
                .typeOfAnimal("Dog")
                .estimatedAge(1)
                .entryDate(Date.valueOf("2023-02-15"))
                .arrivalConditions("cagado de fome")
                .provisionalName("EL Cabron")
                .nameOfWhoReceived("River")
                .build();

        var cat = AnimalDto.builder()
                .portOfAnimal("Medio")
                .breed("Persio")
                .typeOfAnimal("Cat")
                .estimatedAge(1)
                .entryDate(Date.valueOf("2023-02-15"))
                .arrivalConditions("cagado de fome")
                .provisionalName("Flap")
                .nameOfWhoReceived("River")
                .build();

        return List.of(dog, cat);
    }

    public static List<AnimalDto> allCatsDto(){
        var cat = AnimalDto.builder()
                .portOfAnimal("Medio")
                .breed("Persio")
                .typeOfAnimal("Cat")
                .estimatedAge(1)
                .entryDate(Date.valueOf("2023-02-15"))
                .arrivalConditions("cagado de fome")
                .provisionalName("Flap")
                .nameOfWhoReceived("River")
                .build();

        var anotherCat = AnimalDto.builder()
                .portOfAnimal("Grande")
                .breed("SRD")
                .typeOfAnimal("Cat")
                .estimatedAge(5)
                .entryDate(Date.valueOf("2023-02-15"))
                .arrivalConditions("cagado de fome")
                .provisionalName("Jack")
                .nameOfWhoReceived("River")
                .build();

        return List.of(cat, anotherCat);
    }

    public static List<AnimalDto> allDogsDto(){
        var dog = AnimalDto.builder()
                .portOfAnimal("Grande")
                .breed("PitBull")
                .typeOfAnimal("Dog")
                .estimatedAge(10)
                .entryDate(Date.valueOf("2023-02-15"))
                .arrivalConditions("Bem velhinho")
                .provisionalName("Timoty")
                .nameOfWhoReceived("River")
                .build();

        var anotherDog = AnimalDto.builder()
                .portOfAnimal("Pequeno")
                .breed("Pintcher")
                .typeOfAnimal("Dog")
                .estimatedAge(5)
                .entryDate(Date.valueOf("2023-02-15"))
                .arrivalConditions("50% odio 50% tremedeira")
                .provisionalName("Planck")
                .nameOfWhoReceived("River")
                .build();

        return List.of(dog, anotherDog);
    }

    public static AnimalDto animalDtoToBeSaved(){
        return  AnimalDto.builder()
                .id(1)
                .portOfAnimal("Pequeno")
                .breed("Pintcher")
                .typeOfAnimal("Dog")
                .estimatedAge(5)
                .entryDate(Date.valueOf("2023-02-15"))
                .arrivalConditions("50% odio 50% tremedeira")
                .provisionalName("Planck")
                .nameOfWhoReceived("River")
                .build();
    }
}
