package Dao;

import org.springframework.data.repository.CrudRepository;

import entitys.Categoria; 

public interface CategoriaDao extends CrudRepository<Categoria, Long>{
    
}
