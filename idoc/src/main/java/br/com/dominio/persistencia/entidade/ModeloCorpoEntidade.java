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

import br.com.dominio.Corpo;

@Entity
@Table
public class ModeloCorpoEntidade implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name = "id_modelo_corpo", sequenceName = "id_modelo_corpo_sequencia", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_modelo_corpo")
	private Long codigoUnico;
	
	@OneToMany
	public List<UltimaAlteracaoEntidade> ultimaAlteracao;
	
	@OneToOne
	private CorpoEntidade modelo;
	
	public void setModelo( Corpo modelo ){
		CorpoEntidade corpoEntidade = new CorpoEntidade();
		 corpoEntidade.setCorpo(modelo);
		this.modelo = new CorpoEntidade();
		this.modelo.setCorpo(modelo);
	}
	
	public Corpo getCorpo(){
		return this.modelo.getCorpo();
	}
	
}
