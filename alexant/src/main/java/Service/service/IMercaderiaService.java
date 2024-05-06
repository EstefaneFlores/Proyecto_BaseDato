package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import entitys.Mercaderia;

@Service
public interface IMercaderiaService {
    public List<Mercaderia> findAll();

    public void save(Mercaderia Mercaderia);

    public Mercaderia findOne(Long id);

    public void delete(Long id);

}