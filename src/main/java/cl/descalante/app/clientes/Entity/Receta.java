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
	private Long id;
	@Column(name = "Le_Od_Esf")
	private String leOdEsf;
	@Column(name = "Le_Od_Cil")
	private String leOdCil;
	@Column(name = "Le_Od_Eje")
	private String leOdEje;
	@Column(name = "Le_Oi_Esf")
	private String leOiEsf;
	@Column(name = "Le_Oi_Cil")
	private String leOiCil;
	@Column(name = "Le_Oi_Eje")
	private String leOiEje;
	@Column(name = "Ce_Od_Esf")
	private String ceOdEsf;
	@Column(name = "Ce_Od_Cil")
	private String ceOdCil;
	@Column(name = "Ce_Od_Eje")
	private String ceOdEje;
	@Column(name = "Ce_Oi_Esf")
	private String ceOiEsf;
	@Column(name = "Ce_Oi_Cil")
	private String ceOiCil;
	@Column(name = "Ce_Oi_Eje")
	private String ceOiEje;
	@Column(name = "adherencia")
	private String adherencia;
	@Column(name = "id_cliente")
	private int idCliente;
	private String fecha;
	private int estatus;
	@Column(name = "id_orden_trabajo")
	private int idOrdenTrabajo;
	
	
	private static final long serialVersionUID = -5574130520560226428L;

}
