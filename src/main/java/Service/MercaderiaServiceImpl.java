package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.MercaderiaDao;
import entitys.Mercaderia;

@Service
public class MercaderiaServiceImpl implements IMercaderiaService {
    @Autowired
    private MercaderiaDao mercaderiaDao;

    @Override
    public List<Mercaderia> findAll() {
        return (List<Mercaderia>) mercaderiaDao.findAll();
    }

    @Override
    public void save(Mercaderia mercaderia) {
        mercaderiaDao.save(mercaderia);
    }

    @Override
    public Mercaderia findOne(Long id) {
        return mercaderiaDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        mercaderiaDao.deleteById(id);
    }

}
