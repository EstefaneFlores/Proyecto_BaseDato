package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import entitys.Factura;

@Service
public interface IFacturaService {
    public List<Factura> findAll();

    public void save(Factura factura);

    public Factura findOne(Long id);

    public void delete(Long id);

}
