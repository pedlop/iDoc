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
public class ModeloEntidade implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "id_modelo", sequenceName = "id_modelo_sequencia", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_modelo")
	private Long codigoUnico;
	
	@Column( columnDefinition = "text")
	private String ModeloJson;

	public Long getCodigoUnico() {
		return codigoUnico;
	}

	public void setCodigoUnico(Long codigoUnico) {
		this.codigoUnico = codigoUnico;
	}

	public String getModeloJson() {
		return ModeloJson;
	}

	public void setModeloJson(String modeloJson) {
		ModeloJson = modeloJson;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
