package cl.descalante.app.clientes.Service;

import java.util.List;

import cl.descalante.app.clientes.Entity.Cliente;
import cl.descalante.app.clientes.responses.ResponseClienteReceta;

public interface IClienteService {
	
	public List<Cliente> findAll();
	public ResponseClienteReceta findById(Long id);
	public Cliente save(Cliente cliente);
	public void deleteById(Long id);
	
}
