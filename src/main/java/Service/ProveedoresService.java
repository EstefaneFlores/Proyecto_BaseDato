package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import entitys.Proveedores;

@Service
public interface ProveedoresService {
    
  public List<Proveedores> findAll(); //MOSTRAR TODOS LOS REGSITROS

    public void save(Proveedores proveedores);  //GUARDAR REGISTRO

    public Proveedores findById(Long id);  // MOSTRAR UN REGSITRO


    public void deleteById(Long id);


}
