package upeu.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import upeu.dao.ClienteDao;
import upeu.entity.Cliente;
import upeu.repository.ClienteRepository;

@Component
public class ClienteDaoImpl implements ClienteDao{

	@Autowired
	private ClienteRepository repository;
	@Override
	public Cliente create(Cliente a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Cliente update(Cliente a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public Optional<Cliente> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
