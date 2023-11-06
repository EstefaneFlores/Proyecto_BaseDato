package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.ProveedorDao;
import entitys.Proveedores;

@Service
public class ProveedoresServiceImpl implements ProveedoresService{

    @Autowired
    private ProveedorDao proveedorDao;

    @Override
    public List<Proveedores> findAll() {
        return (List<Proveedores>) proveedorDao.findAll();
    }

    @Override
    public void save(Proveedores proveedores) {
      proveedorDao.save(proveedores);
    }

    @Override
    public Proveedores findById(Long id) {
       return  proveedorDao.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
     proveedorDao.deleteById(id);
    }


}
