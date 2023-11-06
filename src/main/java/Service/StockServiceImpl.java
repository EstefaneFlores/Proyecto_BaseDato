package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.StockDao;
import entitys.Stock;

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockDao stockDao;

    @Override
    public List<Stock> findAll() {
      return (List<Stock>) stockDao.findAll();
    }

    @Override
    public void save(Stock stock) {
      stockDao.save(stock);

    }

    @Override
    public void delete(Long id) {
      stockDao.deleteById(id);
    }

    @Override
    public Stock find(Long id) {
     return stockDao.findById(id).orElse(null);
    }
    
}
