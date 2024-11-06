package upeu.dao;

import java.util.List;
import java.util.Optional;

import upeu.entity.Cliente;

public interface ClienteDao {
	Cliente create(Cliente a);
	Cliente update(Cliente a);
	void delete(Long id);
	Optional<Cliente>read(Long id);
	List<Cliente>readAll();
}
