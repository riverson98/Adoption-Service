package rcosta.com.adoptionservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rcosta.com.adoptionservice.entity.Animal;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    @Query("SELECT a FROM Animal a WHERE a.dateOfAdoption IS NULL ORDER BY a.entryDate")
    List<Animal> findNotAdopted();

    @Query("SELECT a FROM Animal a WHERE a.dateOfAdoption IS NOT NULL")
    List<Animal> findAdopted();

    @Query("SELECT a FROM Animal a WHERE a.typeOfAnimal = 'Cat'")
    List<Animal> findAllCats();

    @Query("SELECT a FROM Animal a WHERE a.typeOfAnimal = 'Dog'")
    List<Animal> findAllDogs();
}
