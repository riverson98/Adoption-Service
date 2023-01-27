package rcosta.com.adoptionservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String provisionalName;

    @Column(nullable = false)
    private Integer estimatedAge;

    @Column(nullable = false)
    private String typeOfAnimal;

    @Column(nullable = false)
    private String breed;

    @Column(nullable = false)
    private Date entryDate;

    @Column()
    private Date dateOfAdoption;

    @Column(nullable = false)
    private String arrivalConditions;

    @Column(nullable = false)
    private String nameOfWhoReceived;

    @Column()
    private Date dateOfDeath;

    @Column(nullable = false)
    private String portOfAnimal;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvisionalName() {
        return provisionalName;
    }

    public void setProvisionalName(String provisionalName) {
        this.provisionalName = provisionalName;
    }

    public Integer getEstimatedAge() {
        return estimatedAge;
    }

    public void setEstimatedAge(Integer estimatedAge) {
        this.estimatedAge = estimatedAge;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getDateOfAdoption() {
        return dateOfAdoption;
    }

    public void setDateOfAdoption(Date dateOfAdoption) {
        this.dateOfAdoption = dateOfAdoption;
    }

    public String getArrivalConditions() {
        return arrivalConditions;
    }

    public void setArrivalConditions(String arrivalConditions) {
        this.arrivalConditions = arrivalConditions;
    }

    public String getNameOfWhoReceived() {
        return nameOfWhoReceived;
    }

    public void setNameOfWhoReceived(String nameOfWhoReceived) {
        this.nameOfWhoReceived = nameOfWhoReceived;
    }

    public Date getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(Date dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String getPortOfAnimal() {
        return portOfAnimal;
    }

    public void setPortOfAnimal(String portOfAnimal) {
        this.portOfAnimal = portOfAnimal;
    }
}
