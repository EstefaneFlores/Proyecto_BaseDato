package Service;

import java.util.List;

import entitys.Venta;

public interface IVentaService {

    public List<Venta> findAll();

    public void save(Venta venta);

    public Venta findOne(Long id);

    public void delete(Long id);
}
