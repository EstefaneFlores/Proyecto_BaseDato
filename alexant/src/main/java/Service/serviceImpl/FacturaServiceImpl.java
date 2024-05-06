package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.FacturaDao;
import entitys.Factura;

@Service
public class FacturaServiceImpl implements IFacturaService {

    @Autowired
    private FacturaDao facturaDao;

    @Override
    public List<Factura> findAll() {
        return (List<Factura>) facturaDao.findAll();
    }

    @Override
    public void save(Factura factura) {
        facturaDao.save(factura);
    }

    @Override
    public Factura findOne(Long id) {
        return facturaDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        facturaDao.deleteById(id);
    }

}
