package cl.descalante.app.clientes.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.descalante.app.clientes.Entity.Cliente;
import cl.descalante.app.clientes.Entity.Receta;
import cl.descalante.app.clientes.dao.ClientesDao;
import cl.descalante.app.clientes.dao.RecetaDao;
import cl.descalante.app.clientes.responses.ResponseClienteReceta;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ServiceClienteImpl implements IClienteService {

	@Autowired
	private ClientesDao clientesDao;
	
	@Autowired
	private RecetaDao recetaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clientesDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public ResponseClienteReceta findById(Long id) {
		
		ResponseClienteReceta resultado = new ResponseClienteReceta();
		Cliente cliente = clientesDao.findById(id).orElse(null);
		List<Receta> receta = recetaDao.findByIdcliente(cliente.getId());
		resultado.setClieRut(cliente.getClieRut());
		resultado.setCliestatus(cliente.getCliestatus());
		resultado.setClieNombre(cliente.getClieNombre());
		resultado.setClieAddress(cliente.getClieAddress());
		resultado.setCliePhone(cliente.getCliePhone());
		resultado.setClieEmail(cliente.getClieEmail());
		resultado.setClieFacebook(cliente.getClieFacebook());
		resultado.setClieTwitter(cliente.getClieTwitter());
		resultado.setClieInstagram(cliente.getClieInstagram());
		resultado.setClieDateBorn(cliente.getClieDateBorn());
		resultado.setClieGender(cliente.getClieGender());
		resultado.setClieDateRegist(cliente.getClieDateRegist());
		resultado.setReceta(receta);
		log.info("receta es {} ", receta);
		return resultado;
	}

	@Override
	public Cliente save(Cliente cliente) {
		return clientesDao.save(cliente);
	}

	@Override
	public void deleteById(Long id) {
		clientesDao.deleteById(id);
	}

}
