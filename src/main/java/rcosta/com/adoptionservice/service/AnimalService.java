package rcosta.com.adoptionservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rcosta.com.adoptionservice.dto.AnimalDto;
import rcosta.com.adoptionservice.repository.AnimalRepository;
import rcosta.com.adoptionservice.util.EntityDtoUtil;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public List<AnimalDto> getAllAnimals(){
        return animalRepository.findAll()
                .stream().map(EntityDtoUtil::toDto)
                .collect(Collectors.toList());
    }

    public List<AnimalDto> getAllCats(){
        return animalRepository.findAllCats()
                .stream().map(EntityDtoUtil::toDto)
                .collect(Collectors.toList());
    }

    public List<AnimalDto> getAllDogs(){
        return animalRepository.findAllDogs()
                .stream().map(EntityDtoUtil::toDto)
                .collect(Collectors.toList());
    }

    public AnimalDto saveAnimal(AnimalDto animalDto){
        var entity = EntityDtoUtil.toEntity(animalDto);
        this.animalRepository.save(entity);
        return EntityDtoUtil.toDto(entity);
    }

    public List<AnimalDto> listsAllAnimalsThatHaveNotYetBeenAdopted(){
        var animals = this.animalRepository.findNotAdopted();

        return animals.stream()
                .map(EntityDtoUtil::toDto)
                .collect(Collectors.toList());

    }
    public List<AnimalDto> listsAllAnimalsAdopted(){
        var animals = this.animalRepository.findAdopted();

        return animals.stream()
                .map(EntityDtoUtil::toDto)
                .collect(Collectors.toList());

    }
}
