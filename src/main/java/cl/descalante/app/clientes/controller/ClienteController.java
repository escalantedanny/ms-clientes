package cl.descalante.app.clientes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cl.descalante.app.clientes.Entity.Cliente;
import cl.descalante.app.clientes.Service.IClienteService;
import cl.descalante.app.clientes.responses.ResponseClienteReceta;

@RestController
public class ClienteController {
	
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/clientes")
	public ResponseClienteReceta listar(){
		return clienteService.findAll();
	}
	
	@GetMapping("/cliente/{id}")
	public Cliente detalleCliente(@PathVariable Long id ){
		return clienteService.findById(id);
	}	
	
}
