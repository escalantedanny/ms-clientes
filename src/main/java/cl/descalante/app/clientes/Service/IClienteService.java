package cl.descalante.app.clientes.Service;

import cl.descalante.app.clientes.Entity.Cliente;
import cl.descalante.app.clientes.responses.ResponseClienteReceta;

public interface IClienteService {
	
	public ResponseClienteReceta findAll();
	public Cliente findById(Long id);
	
}
