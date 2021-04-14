package cl.descalante.app.clientes.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.descalante.app.clientes.Entity.Cliente;
import cl.descalante.app.clientes.dao.ClientesDao;
import cl.descalante.app.clientes.responses.ResponseClienteReceta;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ServiceClienteImpl implements IClienteService {

	@Autowired
	private ClientesDao clientesDao;
	
	@Override
	@Transactional(readOnly = true)
	public ResponseClienteReceta findAll() {
		
		ResponseClienteReceta dataResult = new ResponseClienteReceta();
		
		List<Cliente> clientes = clientesDao.clienteList();
		
		
		log.info(clientes.toString());
		return dataResult;
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id) {
		return clientesDao.findById(id).orElse(null);
	}

}
