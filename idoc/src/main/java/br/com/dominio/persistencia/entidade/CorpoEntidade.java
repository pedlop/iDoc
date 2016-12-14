package br.com.dominio.persistencia.entidade;

/**
 * @author  Lucas Vinicios
 * @version 1.0
 * @see     2016-12-9
 * 
 * */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.dominio.Campo;
import br.com.dominio.Corpo;
import br.com.dominio.UltimaAlteracao;

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
	
	@OneToMany( cascade = CascadeType.ALL )
	private List<CampoEntidade> listaCampo;
	
	@OneToMany
	private List<UltimaAlteracaoEntidade> ultimaAlteracaoEntidades;
	
	@ManyToOne
	private DocumentoEntidade documentoEntidade;
	
	@OneToOne
	private ModeloCorpoEntidade modelo;
	
	public void setCorpo( Corpo corpo  ){
		this.listaCampo = new ArrayList<CampoEntidade>();
		corpo.camposCorpo().forEach( a -> this.listaCampo.add(new CampoEntidade(a)));
	}
	
	public void setAlteracao( UltimaAlteracaoEntidade ultimaAlteracaoEntidade ){
		if( this.ultimaAlteracaoEntidades == null )
			this.ultimaAlteracaoEntidades = new ArrayList<UltimaAlteracaoEntidade>();
		this.ultimaAlteracaoEntidades.add(ultimaAlteracaoEntidade);
	}
	
	public Corpo getCorpo(){
		List<UltimaAlteracao> ultimasAlteracoes = new ArrayList<UltimaAlteracao>();
		List<Campo> listaCampo = new ArrayList<Campo>();
		this.listaCampo.forEach( a -> listaCampo.add(a.getCampo()));
		this.ultimaAlteracaoEntidades.forEach( a -> ultimasAlteracoes.add( a.getUltimaAlteracao()));
		Corpo corpo = new Corpo(this.codigoUnico, ultimasAlteracoes, null, listaCampo);
		return corpo;
	}
}
