package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.VendedorDao;
import entitys.Vendedor;

@Service
public class VendedorServiceImpl implements IVendedorService{
    @Autowired
    private VendedorDao vendedorDao;
    @Override
    public List<Vendedor> findAll() {
    return(List<Vendedor>) vendedorDao.findAll(); 
    }

    @Override
    public void save(Vendedor vendedor) {
    vendedorDao.save(vendedor);
    }

    @Override
    public Vendedor findOne(Long id) {
    return vendedorDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
    vendedorDao.deleteById(id);
    }
    
}
