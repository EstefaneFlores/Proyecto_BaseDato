package Dao;

import org.springframework.data.repository.CrudRepository;

import entitys.Cliente;

public interface CategoriaDao extends CrudRepository<Cliente, Long>{
    
}
