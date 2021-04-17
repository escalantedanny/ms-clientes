package cl.descalante.app.clientes.dao;

import org.springframework.data.repository.CrudRepository;

import cl.descalante.app.clientes.Entity.Cliente;

public interface ClientesDao extends CrudRepository<Cliente, Long> {

}
