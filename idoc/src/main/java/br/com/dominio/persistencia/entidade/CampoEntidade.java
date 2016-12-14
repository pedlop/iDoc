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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.dominio.Campo;
import br.com.dominio.TipoCampo;

@Entity
@Table
public class CampoEntidade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "id_campo", sequenceName = "id_campo_sequencia", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_campo")
	private Long codigoUnico;

	@Column
	private String nomeCampo;

	@Column
	private String textoAjudaCampo;

	@Enumerated(EnumType.ORDINAL)
	public TipoCampo tipoCampo;

	@Column(columnDefinition = "text")
	private String conteudo;
	
	@ManyToOne
	private CorpoEntidade corpo;
	
	@OneToMany
	private List<UltimaAlteracaoEntidade> ultimaAlteracao;
	
	@OneToOne
	private IntroducaoEntidade introducaoEntidade;
	
	@OneToOne
	private CabecalhoEntidade  cabecalhoEntidade;
	
	@OneToOne
	private ModeloCampoEntidade modelo;
	
	public CampoEntidade(){
		
	}
	
	public CampoEntidade( Campo campo ){
		this.setCampo(campo);
	}
	
	public void setCampo(Campo campo) {
		this.nomeCampo = campo.getNomeCampo();
		this.textoAjudaCampo = campo.getTextoAjudaCampo();
		this.tipoCampo = campo.getTipoCampo();
		this.conteudo = campo.getConteudo();
	}
	
	public void setAlteracao( UltimaAlteracaoEntidade ultimaAlteracaoEntidade ){
		if( this.ultimaAlteracao == null )
			 this.ultimaAlteracao = new ArrayList<UltimaAlteracaoEntidade>();
		this.ultimaAlteracao.add(ultimaAlteracaoEntidade);
	}
	
	

	public Campo getCampo() {
		Campo campo = new Campo(this.codigoUnico, this.nomeCampo, this.textoAjudaCampo, this.tipoCampo, this.conteudo);
		return campo;
	}

}
