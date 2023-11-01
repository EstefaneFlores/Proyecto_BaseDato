package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entitys.Cliente;
import entitys.Det_Venta;

@Service
public class Det_VentaServiceImpl  implements Det_VentaService{

    @Autowired
    private Det_VentaService det_VentaService;

    @Override
    public List<Det_Venta> findAll() {
       return (List<Det_Venta>) det_VentaService.findAll();
    }

    @Override
    public void save(Det_Venta det_Venta) {
       det_VentaService.save(det_Venta);
    }

    @Override
    public Det_Venta findById(Long id) {
      return det_VentaService.findById(id);
    }

    @Override
    public void deleteById(Long id) {
      det_VentaService.deleteById(id);
    }
    
}
