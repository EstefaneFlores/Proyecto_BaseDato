package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entitys.Proveedores;

@Service
public class ProveedoresServiceImpl implements ProveedoresService{

    @Autowired
    private ProveedoresServiceImpl mProve;

    @Override
    public List<Proveedores> findAll() {
        return (List<Proveedores>) mProve.findAll();
    }

    @Override
    public void save(Proveedores proveedores) {
      mProve.save(proveedores);
    }

    @Override
    public Proveedores findById(Long id) {
       return  mProve.findById(id);
    }

    @Override
    public void deleteById(Long id) {
     mProve.deleteById(id);
    }


}
