package br.com.dominio.persistencia.entidade;

/**
 * @author  Lucas Vinicios
 * @version 1.0
 * @see     2016-12-10
 * 
 * */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.dominio.Cabecalho;
import br.com.dominio.Corpo;
import br.com.dominio.Documento;
import br.com.dominio.Introducao;
import br.com.dominio.UltimaAlteracao;


@Entity
@Table
public class DocumentoEntidade implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name = "id_documento", sequenceName = "id_documento_sequencia", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_documento")
	private Long codigoUnico;
	
	@OneToOne
	private CabecalhoEntidade cabecalhoEntidade;
	
	@OneToOne
	private IntroducaoEntidade introducaoEntidade;
	
	@ManyToOne
	private ModeloEntidade modeloEntidade;
	
	@OneToMany
	private List<CorpoEntidade> partesDocumento;
	
	@OneToMany
	private List<UltimaAlteracaoEntidade> ultimaAlteracao;
	
	public void setDocumento(  Cabecalho cabecalho, Introducao introducao, List<UltimaAlteracao> historicoAlteracao, UltimaAlteracao ultimaAlteracao){
		this.cabecalhoEntidade 	= new CabecalhoEntidade();
		this.introducaoEntidade = new IntroducaoEntidade();
		this.cabecalhoEntidade.setCabecalho(cabecalho, ultimaAlteracao);
		this.introducaoEntidade.setIntroducao(introducao, ultimaAlteracao);
		if( this.ultimaAlteracao == null )
			this.ultimaAlteracao = new ArrayList<UltimaAlteracaoEntidade>();
		this.ultimaAlteracao.add( new UltimaAlteracaoEntidade(ultimaAlteracao));
	}
	
	public void setDocumento(  Cabecalho cabecalho, Introducao introducao, List<Corpo> partesDocumento, List<UltimaAlteracao> historicoAlteracao, UltimaAlteracao ultimaAlteracao){
		this.cabecalhoEntidade 	= new CabecalhoEntidade();
		this.introducaoEntidade = new IntroducaoEntidade();
		this.cabecalhoEntidade.setCabecalho(cabecalho, ultimaAlteracao);
		this.introducaoEntidade.setIntroducao(introducao, ultimaAlteracao);
		if( this.ultimaAlteracao == null )
			this.ultimaAlteracao = new ArrayList<UltimaAlteracaoEntidade>();
		if( this.partesDocumento == null )
			this.partesDocumento = new ArrayList<CorpoEntidade>();
		this.ultimaAlteracao.add( new UltimaAlteracaoEntidade(ultimaAlteracao));
		partesDocumento.forEach( a -> {
			if( this.partesDocumento == null )
				this.partesDocumento = new ArrayList<CorpoEntidade>();
			CorpoEntidade corpoEntidade = new CorpoEntidade();
			corpoEntidade.setCorpo(a);
			this.partesDocumento.add(corpoEntidade);
		});
	}
	
	public Documento getDocumento(){
		List<UltimaAlteracao> listaAlteracao = new ArrayList<UltimaAlteracao>();
		this.ultimaAlteracao.forEach( a -> listaAlteracao.add(a.getUltimaAlteracao()));
		return new Documento( this.codigoUnico, this.cabecalhoEntidade.getCabecalho(), this.introducaoEntidade.getIntroducao(), listaAlteracao, null);
	}
}
