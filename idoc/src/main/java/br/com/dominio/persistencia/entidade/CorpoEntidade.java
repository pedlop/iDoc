package br.com.dominio.persistencia.entidade;

/**
 * @author  Lucas Vinicios
 * @version 1.0
 * @see     2016-12-9
 * 
 * */

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class CorpoEntidade implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "id_corpo", sequenceName = "id_corpo_sequencia", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_corpo")
	private Long codigoUnico;
	
	@Column( columnDefinition = "text")
	private String CorpoJson;

	public Long getCodigoUnico() {
		return codigoUnico;
	}

	public void setCodigoUnico(Long codigoUnico) {
		this.codigoUnico = codigoUnico;
	}

	public String getCorpoJson() {
		return CorpoJson;
	}

	public void setCorpoJson(String corpoJson) {
		CorpoJson = corpoJson;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
