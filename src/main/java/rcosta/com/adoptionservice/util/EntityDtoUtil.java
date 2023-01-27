package rcosta.com.adoptionservice.util;

import org.springframework.beans.BeanUtils;
import rcosta.com.adoptionservice.dto.AnimalDto;
import rcosta.com.adoptionservice.entity.Animal;

public class EntityDtoUtil {

    private EntityDtoUtil() {
        throw new UnsupportedOperationException("Its a util Class");
    }

    public static Animal toEntity(AnimalDto animalDto){
        var animal = new Animal();
        BeanUtils.copyProperties(animalDto, animal);
        return animal;
    }

    public static AnimalDto toDto(Animal animal){
        var dto = new AnimalDto();
        BeanUtils.copyProperties(animal, dto);
        return dto;
    }
}
