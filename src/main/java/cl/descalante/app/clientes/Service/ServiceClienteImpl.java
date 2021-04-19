package cl.descalante.app.clientes.Service;

import java.util.List;

import javax.script.ScriptException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.descalante.app.clientes.Entity.Cliente;
import cl.descalante.app.clientes.Entity.Receta;
import cl.descalante.app.clientes.dao.ClientesDao;
import cl.descalante.app.clientes.dao.RecetaDao;
import cl.descalante.app.clientes.exception.CustomError;
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
	public List<Cliente> findAll() throws CustomError {
		try {			
			return (List<Cliente>) clientesDao.findAll();
		} catch (Exception e) {
			throw new CustomError("error en la busqueda de clientes");
		}
	}

	@Override
	@Transactional(readOnly = true)
	public ResponseClienteReceta findById(Long id) throws CustomError{
		
		ResponseClienteReceta resultado = new ResponseClienteReceta();
		try {
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
		} catch (Exception e) {
			if(resultado.getClieRut() == null) throw new CustomError("rut invalido");
			else if(id == null) throw new CustomError("id cliente es obligartorio");
			else throw new CustomError("cliente invalido");
		}
	}

	@Override
	public Cliente save(Cliente cliente) throws CustomError, ScriptException{
		try {
			return clientesDao.save(cliente);
		} catch (Exception e) {
			if(cliente.getClieRut() == null) throw new CustomError("rut es Obligatorio");
			else if(cliente.getClieNombre() == null) throw new CustomError("nombre es obligatorio");
			else if(cliente.getClieAddress() == null) throw new CustomError("direccion es obligatoria");
			else if(cliente.getCliePhone() == null) throw new CustomError("telefono es obligatorio");
			else if(cliente.getClieEmail() == null) throw new CustomError("email es ogligatorio");
			else throw new CustomError("usuario invalido");
		}
	}

	@Override
	public void deleteById(Long id) throws CustomError{
		try {			
			clientesDao.deleteById(id);
		} catch (Exception e) {
			if(id == null) throw new CustomError("id cliente es obligartorio");
			else throw new CustomError("cliente invalido");
		}
	}

}
