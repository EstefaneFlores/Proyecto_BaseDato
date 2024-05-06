package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.ProductoDao;
import entitys.Producto;

@Service
public class ProductoService implements IProductoService {
    @Autowired
    private ProductoDao productoDao;

    @Override
    public List<Producto> findAll() {
        return (List<Producto>) productoDao.findAll();
    }

    @Override
    public void save(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    public Producto findOne(Long id) {
        return productoDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        productoDao.deleteById(id);
    }

}
