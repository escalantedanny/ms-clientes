package cl.descalante.app.clientes.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "tbl_orden")
public class Orden implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "idorden")
	private int idOrden;
	
	@Column(name = "idcliente")
	private int idCliente;
	
	@Column(name = "detalle")
	private String detalle;
	
	@Column(name = "laboratorio")
	private int laboratorio;
	
	@Column(name = "tipopago")
	private int tipopago;
	
	@Column(name = "fechaentrega")
	private Date fechaEntrega;
	
	@Column(name = "fecharetiro")
	private Date fecharetiro;
	
	@Column(name = "ledipupilar")
	private String ledipupilar;
	
	@Column(name = "cedipupilar")
	private String ceDiPupilar;
	
	@Column(name = "idvendedor")
	private int idVendedor;
	
	@Column(name = "statusorden")
	private int statusOrden;
	
	private static final long serialVersionUID = 3417600745515138259L;

}
