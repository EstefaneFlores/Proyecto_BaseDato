package Dao;

import org.springframework.data.repository.CrudRepository;

import entitys.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long> {

}