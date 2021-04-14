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
@Table(name = "tbl_client")
public class Cliente implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "clie_rut")
	private String clieRut;
	@Column(name = "clie_status")
	private String cliestatus;
	@Column(name = "clie_nombre")
	private String clieNombre;
	@Column(name = "clie_addr")
	private String clieAddress;
	@Column(name= "clie_phone")
	private String cliePhone;
	@Column(name = "clie_email")
	private String clieEmail;
	@Column(name = "clie_facebook")
	private String clieFacebook;
	@Column(name = "clie_twitter")
	private String clieTwitter;
	@Column(name = "clie_instagram")
	private String clieInstagram;
	@Column(name = "clie_dateborn")
	private String clieDateBorn;
	@Column(name = "clie_gender")
	private String clieGender;
	@Column(name = "clie_dateregist")
	private String clieDateRegist;
	
	private static final long serialVersionUID = -922472834459252187L;

}
