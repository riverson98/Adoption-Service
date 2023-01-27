package rcosta.com.adoptionservice.helpers;

import rcosta.com.adoptionservice.dto.AnimalDto;
import rcosta.com.adoptionservice.entity.Animal;

import java.sql.Date;
import java.util.List;

public class AnimalEntityCreator {

    private AnimalEntityCreator() {
        throw new UnsupportedOperationException("its a util class");
    }

    public static List<Animal> animalEntityList(){
        var dog = Animal.builder()
                .portOfAnimal("Medio")
                .breed("SRD")
                .typeOfAnimal("Dog")
                .estimatedAge(1)
                .entryDate(Date.valueOf("2023-02-15"))
                .arrivalConditions("cagado de fome")
                .provisionalName("EL Cabron")
                .nameOfWhoReceived("River")
                .build();

        var cat = Animal.builder()
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

    public static List<Animal> allCatsEntity(){
        var cat = Animal.builder()
                .portOfAnimal("Medio")
                .breed("Persio")
                .typeOfAnimal("Cat")
                .estimatedAge(1)
                .entryDate(Date.valueOf("2023-02-15"))
                .arrivalConditions("cagado de fome")
                .provisionalName("Flap")
                .nameOfWhoReceived("River")
                .build();

        var anotherCat = Animal.builder()
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
    public static List<Animal> allDogsEntity(){
        var dog = Animal.builder()
                .portOfAnimal("Grande")
                .breed("PitBull")
                .typeOfAnimal("Dog")
                .estimatedAge(10)
                .entryDate(Date.valueOf("2023-02-15"))
                .arrivalConditions("Bem velhinho")
                .provisionalName("Timoty")
                .nameOfWhoReceived("River")
                .build();

        var anotherDog = Animal.builder()
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

    public static List<Animal> allDogsEntityAdopted(){
        var dog = Animal.builder()
                .portOfAnimal("Grande")
                .breed("PitBull")
                .typeOfAnimal("Dog")
                .dateOfAdoption(Date.valueOf("2023-05-15"))
                .estimatedAge(10)
                .entryDate(Date.valueOf("2023-02-15"))
                .arrivalConditions("Bem velhinho")
                .provisionalName("Timoty")
                .nameOfWhoReceived("River")
                .build();

        var anotherDog = Animal.builder()
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

    public static Animal animalEntityToBeSaved() {
            return  Animal.builder()
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
