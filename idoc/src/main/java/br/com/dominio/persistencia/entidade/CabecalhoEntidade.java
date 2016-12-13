package br.com.dominio.persistencia.entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.dominio.Cabecalho;
import br.com.dominio.UltimaAlteracao;

@Entity
@Table
public class CabecalhoEntidade implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name = "id_cabecalho", sequenceName = "id_cabecalho_sequencia", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_cabecalho")
	private Long codigoUnico;
	
	@OneToOne
	private CampoEntidade campoEntidade;
	
	@OneToOne
	private DocumentoEntidade documentoEntidade;
	
	@OneToMany
	public List<UltimaAlteracaoEntidade> ultimaAlteracao;
	
	public void setCabecalho( Cabecalho cabecalho, UltimaAlteracao ultimaAlteracao){
		this.campoEntidade.setCampo(cabecalho.getCabecalho());
		if( this.ultimaAlteracao == null )
			this.ultimaAlteracao = new ArrayList<UltimaAlteracaoEntidade>();
		this.ultimaAlteracao.add( new UltimaAlteracaoEntidade(ultimaAlteracao));
	}
	
	public Cabecalho getCabecalho(){
		List<UltimaAlteracao> lista = new ArrayList<UltimaAlteracao>();
		this.ultimaAlteracao.forEach( a -> lista.add(a.getUltimaAlteracao()));
		return new Cabecalho( this.codigoUnico, lista );
	}
}
