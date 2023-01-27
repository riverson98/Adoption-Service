package rcosta.com.adoptionservice.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import rcosta.com.adoptionservice.dto.AnimalDto;
import rcosta.com.adoptionservice.entity.Animal;
import rcosta.com.adoptionservice.helpers.AnimalDtoCreator;
import rcosta.com.adoptionservice.helpers.AnimalEntityCreator;
import rcosta.com.adoptionservice.repository.AnimalRepository;

import java.sql.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class AnimalServiceTest {

    @InjectMocks
    private AnimalService animalService;

    @Mock
    private AnimalRepository animalRepository;

    private final List<AnimalDto> allDtoAnimals = AnimalDtoCreator.animalDtoList();

    private final List<Animal> allEntityAnimals = AnimalEntityCreator.animalEntityList();

    private final List<Animal> allCats = AnimalEntityCreator.allCatsEntity();

    private final List<Animal> allDogs = AnimalEntityCreator.allDogsEntity();

    private final List<AnimalDto> allCatsDto = AnimalDtoCreator.allCatsDto();

    private final List<AnimalDto> allDogsDto = AnimalDtoCreator.allDogsDto();

    private final AnimalDto animalToBeSavedDto = AnimalDtoCreator.animalDtoToBeSaved();

    private final Animal animalToBeSavedEntity = AnimalEntityCreator.animalEntityToBeSaved();

    private final List<Animal> animalAdopted = AnimalEntityCreator.allDogsEntityAdopted();


    @Test
    void getAllAnimals() {
        Mockito.when(animalRepository.findAll())
                .thenReturn(allEntityAnimals);

        List<AnimalDto> allAnimals = animalService.getAllAnimals();

        assertThat(allAnimals).isNotNull()
                .hasSize(2)
                .containsExactlyInAnyOrderElementsOf(allDtoAnimals)
                .hasOnlyElementsOfType(AnimalDto.class)
                .extracting("typeOfAnimal")
                .contains("Dog", "Cat");
    }

    @Test
    void getAllCats() {
        Mockito.when(animalRepository.findAllCats())
                .thenReturn(allCats);

        List<AnimalDto> allCats = animalService.getAllCats();

        assertThat(allCats).isNotNull()
                .hasSize(2)
                .containsExactlyInAnyOrderElementsOf(allCatsDto)
                .extracting("provisionalName", "typeOfAnimal")
                .contains(Assertions.tuple("Flap", "Cat"),
                        Assertions.tuple("Jack", "Cat"));
    }

    @Test
    void getAllDogs() {
        Mockito.when(animalRepository.findAllDogs())
                .thenReturn(allDogs);

        List<AnimalDto> allDogs = animalService.getAllDogs();

        assertThat(allDogs).isNotNull()
                .hasSize(2)
                .containsExactlyInAnyOrderElementsOf(allDogsDto)
                .extracting("provisionalName", "typeOfAnimal", "arrivalConditions")
                .contains(Assertions.tuple("Timoty", "Dog", "Bem velhinho"),
                        Assertions.tuple("Planck", "Dog", "50% odio 50% tremedeira"));
    }

    @Test
    void saveAnimal() {
        Mockito.when(animalRepository.save(Mockito.any()))
                .thenReturn(animalToBeSavedEntity);

        AnimalDto animalDto = animalService.saveAnimal(animalToBeSavedDto);

        assertThat(animalDto).isNotNull()
                .extracting("id", "typeOfAnimal")
                .contains(1, "Dog");

    }

    @Test
    void listsAllAnimalsThatHaveNotYetBeenAdopted() {
        Mockito.when(animalRepository.findNotAdopted())
                .thenReturn(allDogs);

        List<AnimalDto> animalsNotAdopted = animalService.listsAllAnimalsThatHaveNotYetBeenAdopted();
        assertThat(animalsNotAdopted).isNotNull()
                .hasSize(2)
                .extracting("dateOfAdoption")
                .contains((Object) null);
    }

    @Test
    void listsAllAnimalsAdopted() {
        Mockito.when(animalRepository.findAdopted())
                .thenReturn(animalAdopted);

        List<AnimalDto> animalsAdopted = animalService.listsAllAnimalsAdopted();
        assertThat(animalsAdopted).isNotNull()
                .hasSize(2)
                .extracting("dateOfAdoption")
                .contains(Date.valueOf("2023-05-15"));
    }
}