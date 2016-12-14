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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.dominio.ModeloDocumentacao;
import br.com.dominio.Projeto;
import br.com.dominio.UltimaAlteracao;

@Entity
@Table
public class ProjetoEntidade implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "id_projeto", sequenceName = "id_produto_sequencia", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_projeto")
	private Long codigoUnico;
	
	@Column
	private String nomeProjeto;
	
	@OneToMany
	public List<UltimaAlteracaoEntidade> ultimaAlteracao;
	
	@OneToOne
	private ModeloEntidade modeloEntidade;
	
	public void setProjeto( String nomeProjeto, ModeloDocumentacao modelo, UltimaAlteracao ultimaAlteracao ){
		this.nomeProjeto    = nomeProjeto; 
		this.modeloEntidade = new ModeloEntidade();
		this.modeloEntidade.setDocumento( modelo.getDocumentacaoModelo(), ultimaAlteracao);
	}
	
	public Projeto getProjeto(){
		List<UltimaAlteracao> listaModelo  = new ArrayList<UltimaAlteracao>();
		List<UltimaAlteracao> listaProjeto = new ArrayList<UltimaAlteracao>();
		this.ultimaAlteracao.forEach( a -> listaProjeto.add(a.getUltimaAlteracao()));
		this.modeloEntidade.getUltimasAlteracoes().forEach( a -> listaModelo.add(a.getUltimaAlteracao()));
		
		ModeloDocumentacao modelo = new ModeloDocumentacao( this.modeloEntidade.getCodigoUnico(), 
		this.modeloEntidade.getDocumento(), listaModelo ,null);
		
		Projeto projeto = new Projeto(this.codigoUnico, this.nomeProjeto, modelo, listaProjeto);
		return projeto;
	}

}
