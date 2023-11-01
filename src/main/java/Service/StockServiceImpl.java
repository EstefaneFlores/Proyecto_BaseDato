package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entitys.Stock;

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockService stockService;

    @Override
    public List<Stock> findAll() {
      return (List<Stock>) stockService.findAll();
    }

    @Override
    public void save(Stock stock) {
      stockService.save(stock);

    }

    @Override
    public void deleteById(Long id) {
      stockService.deleteById(id);
    }

    @Override
    public Stock findById(Long id) {
     return stockService.findById(id);
    }
    
}
