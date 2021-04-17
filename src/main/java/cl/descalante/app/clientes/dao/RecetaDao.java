package cl.descalante.app.clientes.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import cl.descalante.app.clientes.Entity.Receta;

public interface RecetaDao extends CrudRepository<Receta, Long>{

	@Query(value = "SELECT * FROM optica.tbl_receta u WHERE u.idcliente =:idcliente ", nativeQuery = true)
	public List<Receta> findByIdcliente( @Param("idcliente") long idcliente);

}
