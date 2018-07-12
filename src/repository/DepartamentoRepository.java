package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Departamento;

@Repository
public interface DepartamentoRepository
	extends CrudRepository<Departamento, Long>{

}
