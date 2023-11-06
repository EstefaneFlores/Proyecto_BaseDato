package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.CategoriaDao;
import entitys.Categoria;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    private  CategoriaDao categoriaDao;

    @Override
    public List<Categoria> findAll() {
        return (List<Categoria>) categoriaDao.findAll();
    }

    @Override
    public void save(Categoria categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    public Categoria findById(Long id) {
       return categoriaDao.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
       categoriaDao.deleteById(id);
    }
    
}
