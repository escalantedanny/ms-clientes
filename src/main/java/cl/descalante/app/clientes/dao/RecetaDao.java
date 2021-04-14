package cl.descalante.app.clientes.dao;

import org.springframework.data.repository.CrudRepository;
import cl.descalante.app.clientes.Entity.Receta;

public interface RecetaDao extends CrudRepository<Receta, Long>{

}
