package cl.descalante.app.clientes.responses;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResponseClienteReceta {
	
	@JsonProperty("clie_rut")
	private String clieRut;
	@JsonProperty("clie_status")
	private String cliestatus;
	@JsonProperty("clie_nombre")
	private String clieNombre;
	@JsonProperty("clie_addr")
	private String clieAddress;
	@JsonProperty("clie_phone")
	private String cliePhone;
	@JsonProperty("clie_email")
	private String clieEmail;
	@JsonProperty("clie_facebook")
	private String clieFacebook;
	@JsonProperty("clie_twitter")
	private String clieTwitter;
	@JsonProperty("clie_instagram")
	private String clieInstagram;
	@JsonProperty("clie_dateborn")
	private Date clieDateBorn;
	@JsonProperty("clie_gender")
	private String clieGender;
	@JsonProperty("clie_dateregist")
	private Date clieDateRegist;
	private Object receta;
	public ResponseClienteReceta() {
		super();
	}

}
