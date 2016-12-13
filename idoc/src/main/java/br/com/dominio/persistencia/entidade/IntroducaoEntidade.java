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

import br.com.dominio.Introducao;
import br.com.dominio.UltimaAlteracao;

@Entity
@Table
public class IntroducaoEntidade implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name = "id_introducao", sequenceName = "id_introducao_sequencia", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_introducao")
	private Long codigoUnico;
	
	@OneToOne
	private CampoEntidade campo;
	
	@OneToOne
	private DocumentoEntidade documentoEntidade;
	
	@OneToMany
	public List<UltimaAlteracaoEntidade> ultimaAlteracao;
	
	public void setIntroducao( Introducao introducao, UltimaAlteracao ultimaAlteracao){
		this.campo.setCampo( introducao.getIntroducao() );
		if( ultimaAlteracao == null )
			this.ultimaAlteracao = new ArrayList<UltimaAlteracaoEntidade>();
		this.ultimaAlteracao.add( new UltimaAlteracaoEntidade(ultimaAlteracao));
	}
	
	public Introducao getIntroducao(){
		List<UltimaAlteracao> lista = new ArrayList<UltimaAlteracao>();
		this.ultimaAlteracao.forEach(a -> lista.add(a.getUltimaAlteracao()));
		return new Introducao( this.codigoUnico, lista , null);
	}
}
