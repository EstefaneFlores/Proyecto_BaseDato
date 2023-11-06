package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.Det_VentaDao;
import entitys.Det_Venta;

@Service
public class Det_VentaServiceImpl  implements Det_VentaService{

    @Autowired
    private Det_VentaDao det_VentaDao;

    @Override
    public List<Det_Venta> findAll() {
       return (List<Det_Venta>) det_VentaDao.findAll();
    }

    @Override
    public void save(Det_Venta det_Venta) {
       det_VentaDao.save(det_Venta);
    }

    @Override
    public Det_Venta findById(Long id) {
      return det_VentaDao.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
      det_VentaDao.deleteById(id);
    }
    
}
