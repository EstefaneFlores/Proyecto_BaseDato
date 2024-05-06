package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import entitys.Persona;

@Service
public interface IPersonaService {
    public List<Persona> findAll();

    public void save(Persona persona);

    public Persona findOne(Long id);

    public void delete(Long id);

    public Persona findByCi(String ci);

}
