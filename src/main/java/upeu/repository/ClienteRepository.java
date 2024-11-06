package upeu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long>{

}
