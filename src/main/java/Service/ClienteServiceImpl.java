package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entitys.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteService clienteService;

    @Override
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteService.findAll();
    }

    @Override
    public void save(Cliente proveedores) {
        clienteService.save(proveedores);
    }

    @Override
    public Cliente findOne(Long id) {
        return clienteService.findOne(id);
    }

    @Override
    public void deleteById(Long id) {
        clienteService.deleteById(id);
    }

}
