package br.com.dominio.persistencia.entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.dominio.UltimaAlteracao;

@Entity
@Table
public class UltimaAlteracaoEntidade {
	
	@Id
	@SequenceGenerator(name = "id_ultima_alteracao", sequenceName = "id_ultima_alteracao_sequencia", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_ultima_alteracao")
	private Long codigoUnico;
	
	@ManyToOne
	private UsuarioEntidade usuario;
	
	@Column
	private Date data;
	
	
	@ManyToOne
	private CampoEntidade campoEntidade;
	
	@ManyToOne
	private CorpoEntidade corpoEntidade;
	
	@ManyToOne
	private CabecalhoEntidade cabecalhoEntidade;
	
	@ManyToOne
	private IntroducaoEntidade introducaoEntidade;
	
	@ManyToOne
	private DocumentoEntidade documentoEntidade;
	
	@ManyToOne
	private ProjetoEntidade projetoEntidade;
	
	public  UltimaAlteracaoEntidade(){
		
	}
	
	public UltimaAlteracaoEntidade( UltimaAlteracao ultimaAlteracao ){
		this.usuario = new UsuarioEntidade( ultimaAlteracao.getUsuario());
		this.data	 = ultimaAlteracao.getDate(); 
	}
	
	public UltimaAlteracao getUltimaAlteracao(){
		return new UltimaAlteracao( this.usuario.getUsuario(), this.data );
	}
}
