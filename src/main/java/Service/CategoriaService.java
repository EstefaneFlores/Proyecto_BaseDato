package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import entitys.Categoria;

@Service
public interface CategoriaService {
 
      public List<Categoria> findAll(); //MOSTRAR TODOS LOS REGSITROS

    public void save(Categoria proveedores);  //GUARDAR REGISTRO

    public Categoria findById(Long id);  // MOSTRAR UN REGSITRO


    public void deleteById(Long id);

}
