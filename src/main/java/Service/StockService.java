package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import entitys.Stock;

@Service
public interface StockService {
    
    public List<Stock> findAll(); //MOSTRAR TODOS LOS REGSITROS

    public void save(Stock stock);  //GUARDAR REGISTRO

    public Stock findById(Long id);  // MOSTRAR UN REGSITRO


    public void deleteById(Long id);

}
