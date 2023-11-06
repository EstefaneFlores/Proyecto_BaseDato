package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import entitys.Producto;

@Service
public interface IProductoService {
    public List<Producto> findAll();

    public void save(Producto producto);

    public Producto findOne(Long id);

    public void delete(Long id);

}
