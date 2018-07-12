package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Empleado;

@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, Long>{

}
