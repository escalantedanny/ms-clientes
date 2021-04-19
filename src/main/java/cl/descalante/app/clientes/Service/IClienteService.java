package cl.descalante.app.clientes.Service;

import java.util.List;

import javax.script.ScriptException;

import cl.descalante.app.clientes.Entity.Cliente;
import cl.descalante.app.clientes.exception.CustomError;
import cl.descalante.app.clientes.responses.ResponseClienteReceta;

public interface IClienteService {
	
	public List<Cliente> findAll() throws CustomError;
	public ResponseClienteReceta findById(Long id) throws CustomError;
	public Cliente save(Cliente cliente) throws CustomError, ScriptException;
	public void deleteById(Long id) throws CustomError;
	
}
