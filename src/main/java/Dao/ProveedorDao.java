package Dao;

import org.springframework.data.repository.CrudRepository;

import entitys.Proveedores;

public interface ProveedorDao extends CrudRepository<Proveedores, Long>{
    
}
