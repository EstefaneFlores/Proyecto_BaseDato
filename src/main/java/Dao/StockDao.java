package Dao;

import org.springframework.data.repository.CrudRepository;

import entitys.Stock;

public interface StockDao extends CrudRepository<Stock, Long>{
    
}
