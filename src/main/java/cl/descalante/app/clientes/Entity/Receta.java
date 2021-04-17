package cl.descalante.app.clientes.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tbl_receta")
public class Receta implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "le_od_esf")
	private String leOdEsf;
	@Column(name = "le_Od_Cil")
	private String leOdCil;
	@Column(name = "le_Od_Eje")
	private String leOdEje;
	@Column(name = "le_oi_esf")
	private String leOiEsf;
	@Column(name = "le_oi_cil")
	private String leOiCil;
	@Column(name = "le_oi_eje")
	private String leOiEje;
	@Column(name = "ce_Od_esf")
	private String ceOdEsf;
	@Column(name = "ce_Od_cil")
	private String ceOdCil;
	@Column(name = "ce_Od_eje")
	private String ceOdEje;
	@Column(name = "ce_oi_esf")
	private String ceOiEsf;
	@Column(name = "ce_oi_cil")
	private String ceOiCil;
	@Column(name = "ce_oi_eje")
	private String ceOiEje;
	@Column(name = "adherencia")
	private String adherencia;
	@Column(name = "idcliente")
	private long idCliente;
	private String fecha;
	private int estatus;
	@Column(name = "id_orden_trabajo")
	private int idOrdenTrabajo;
	
	
	private static final long serialVersionUID = -5574130520560226428L;

}
