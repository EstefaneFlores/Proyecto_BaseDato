package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.VentaDao;
import entitys.Venta;

@Service
public class VentaServiceImpl implements IVentaService {
    
    @Autowired
    private VentaDao ventaDao;

    @Override
    public List<Venta> findAll() {
        return (List<Venta>) ventaDao.findAll();
    }

    @Override
    public void save(Venta venta) {
        ventaDao.save(venta);
    }

    @Override
    public Venta findOne(Long id) {
        return ventaDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        ventaDao.deleteById(id);
    }
    
}
