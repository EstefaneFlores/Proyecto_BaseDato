package Dao;

import org.springframework.data.repository.CrudRepository;

import entitys.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Long>{
    
}
