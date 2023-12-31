package Dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import entitys.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long> {
    @Query(value = "SELECT * FROM persona WHERE persona.ci = ?1", nativeQuery = true)
    public Persona findByCi(String ci);

}