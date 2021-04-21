package cl.descalante.app.clientes.controller;

import java.util.List;

import javax.script.ScriptException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.descalante.app.clientes.Entity.Cliente;
import cl.descalante.app.clientes.Service.IClienteService;
import cl.descalante.app.clientes.exception.CustomError;
import cl.descalante.app.clientes.responses.ResponseClienteReceta;

@RequestMapping(value = "/v1")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RestController
public class ClienteController {
	
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> listar() throws CustomError{
		return clienteService.findAll();
	}
	
	@GetMapping("/cliente/{id}")
	public ResponseClienteReceta detalleCliente(@PathVariable Long id ) throws CustomError{
		return clienteService.findById(id);
	}	
	
	@PostMapping("/save")
	public Cliente guardarCliente(@RequestBody Cliente cliente) throws CustomError, ScriptException {
		return clienteService.save(cliente);
	}
	
	@DeleteMapping("/cliente/{id}")
	public void deleteCliente(@PathVariable Long id) throws CustomError {
		clienteService.deleteById(id);
	}
	
}
