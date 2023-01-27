package rcosta.com.adoptionservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rcosta.com.adoptionservice.dto.AnimalDto;
import rcosta.com.adoptionservice.service.AnimalService;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping
    public List<AnimalDto> getAll(){
        return this.animalService.getAllAnimals();
    }

    @PostMapping
    public AnimalDto save(@RequestBody AnimalDto animalDto){
        return this.animalService.saveAnimal(animalDto);
    }

    @GetMapping("/not-adopted")
    public List<AnimalDto> findAllAnimalsNotAdopted(){
        return this.animalService.listsAllAnimalsThatHaveNotYetBeenAdopted();
    }

    @GetMapping("/adopted")
    public List<AnimalDto> findAllAnimalsAdopted(){
        return this.animalService.listsAllAnimalsAdopted();
    }

    @GetMapping("/dogs")
    public List<AnimalDto> findAllDogs(){
        return this.animalService.getAllDogs();
    }

    @GetMapping("/cats")
    public List<AnimalDto> findAllCats(){
        return this.animalService.getAllCats();
    }
}
