package br.com.dominio.persistencia.entidade;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.dominio.Campo;

@Entity
@Table
public class ModeloCampoEntidade implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@SequenceGenerator(name = "id_modelo_campo", sequenceName = "id_modelo_campo_sequencia", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_modelo_campo")
	private Long codigoUnico;
	
	@OneToOne
	private CampoEntidade modelo;
	
	@OneToMany
	public List<UltimaAlteracaoEntidade> ultimaAlteracao;
	
	public void setModelo( Campo modelo ){
		this.modelo = new CampoEntidade(modelo);
	}
	
	public Campo getModelo(){
		return this.modelo.getCampo();
	}
}
