package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.ClienteDao;
import entitys.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteDao clienteDao;

    @Override
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    public void save(Cliente proveedores) {
       clienteDao.save(proveedores);
    }


    @Override
    public void deleteById(Long id) {
        clienteDao.deleteById(id);
    }

    @Override
    public Cliente findOne(Long id) {
       return clienteDao.findById(id).orElse(null);
    }

}
