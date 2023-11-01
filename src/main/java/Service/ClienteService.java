package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import entitys.Cliente;

@Service
public interface ClienteService {
    
    public List<Cliente> findAll(); //MOSTRAR TODOS LOS REGSITROS

    public void save(Cliente proveedores);  //GUARDAR REGISTRO

    public Cliente findById(Long id);  // MOSTRAR UN REGSITRO

    public void deleteById(Long id);

}
