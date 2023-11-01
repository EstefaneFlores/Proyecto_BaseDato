package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entitys.Categoria;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    private  CategoriaService categoriaService;

    @Override
    public List<Categoria> findAll() {
        return (List<Categoria>) categoriaService.findAll();
    }

    @Override
    public void save(Categoria proveedores) {
        categoriaService.save(proveedores);
    }

    @Override
    public Categoria findById(Long id) {
       return categoriaService.findById(id);
    }

    @Override
    public void deleteById(Long id) {
       categoriaService.deleteById(id);
    }
    
}
