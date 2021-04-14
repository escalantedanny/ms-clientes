package cl.descalante.app.clientes.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cl.descalante.app.clientes.Entity.Cliente;

public interface ClientesDao extends CrudRepository<Cliente, Long> {
	
	public List<Cliente> clienteList();

}
