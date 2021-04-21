package cl.descalante.app.clientes.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import cl.descalante.app.clientes.Entity.Orden;

public interface OrdenDao extends CrudRepository<Orden, Long>{
	
	@Query(value = "SELECT * FROM optica.tbl_orden u WHERE u.idcliente =:idcliente ", nativeQuery = true)
	public List<Orden> findByIdcliente( @Param("idcliente") long idcliente);

}
