package Service;

import java.util.List;

import entitys.Det_Venta;

public interface Det_VentaService {

      public List<Det_Venta> findAll(); //MOSTRAR TODOS LOS REGSITROS

    public void save(Det_Venta proveedores);  //GUARDAR REGISTRO

    public Det_Venta findById(Long id);  // MOSTRAR UN REGSITRO

    public void deleteById(Long id);
    
}
