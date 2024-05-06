package Service;

import java.util.List;

import entitys.Vendedor;

public interface IVendedorService {
    public List<Vendedor> findAll();

    public void save(Vendedor vendedor);

    public Vendedor findOne(Long id);

    public void delete(Long id);
}
