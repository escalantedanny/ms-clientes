package cl.descalante.app.clientes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cl.descalante.app.clientes.Entity.Cliente;
import cl.descalante.app.clientes.Service.IClienteService;
import cl.descalante.app.clientes.responses.ResponseClienteReceta;

@RestController
public class ClienteController {
	
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> listar(){
		return clienteService.findAll();
	}
	
	@GetMapping("/cliente/{id}")
	public ResponseClienteReceta detalleCliente(@PathVariable Long id ){
		return clienteService.findById(id);
	}	
	
	@PostMapping("/save")
	public Cliente guardarCliente(@RequestBody Cliente cliente) {
		return clienteService.save(cliente);
	}
	
	@DeleteMapping("/cliente/{id}")
	public void deleteCliente(@RequestBody Long id) {
		clienteService.deleteById(id);
	}
	
}
