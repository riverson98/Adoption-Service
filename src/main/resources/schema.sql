CREATE TABLE Animal (
  id INT AUTO_INCREMENT NOT NULL,
   provisional_name VARCHAR(255) NOT NULL,
   estimated_age INT NOT NULL,
   type_of_animal VARCHAR(255) NOT NULL,
   breed VARCHAR(255) NOT NULL,
   entry_date date NOT NULL,
   date_of_adoption date,
   arrival_conditions VARCHAR(255) NOT NULL,
   name_of_who_received VARCHAR(255) NOT NULL,
   date_of_death date,
   port_of_animal VARCHAR(255) NOT NULL,
   CONSTRAINT pk_animal PRIMARY KEY (id)
);