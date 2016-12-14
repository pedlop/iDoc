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

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.dominio.Documento;
import br.com.dominio.UltimaAlteracao;

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
	
	@OneToMany
	private List<DocumentoEntidade> documentoEntidade;
	
	@OneToMany
	public List<UltimaAlteracaoEntidade> ultimaAlteracao;
	
	@OneToMany
	private List<ModeloDocumentoEntidade> modelo;
	
	public void setDocumento( List<Documento> documentos, UltimaAlteracao ultimaAlteracao ){
		if( this.documentoEntidade == null )
			this.documentoEntidade = new ArrayList<DocumentoEntidade>();
		documentos.forEach( a -> {
			DocumentoEntidade docEnt = new DocumentoEntidade();
			docEnt.setDocumento( a.getCabecalho(), a.getIntroducao(), a.getAlteracaoes(), ultimaAlteracao);
		});
		this.setAlteracoes(ultimaAlteracao);
	}
	
	public List<Documento> getDocumento(){
		List<Documento> lista = new ArrayList<Documento>();
		this.documentoEntidade.forEach( a -> lista.add( a.getDocumento()));
		return lista;
	}
	
	public void setModelo( List<ModeloDocumentoEntidade> documentos, UltimaAlteracao ultimaAlteracao ){
		this.modelo = documentos;		
		this.setAlteracoes(ultimaAlteracao);
	}
	
	public List<ModeloDocumentoEntidade> getModelo(){
		return this.modelo;
	}
	
	private void setAlteracoes( UltimaAlteracao ultimaAlteracao ){
		if( this.ultimaAlteracao == null )
			this.ultimaAlteracao = new ArrayList<UltimaAlteracaoEntidade>();
		if( ultimaAlteracao != null )
			this.ultimaAlteracao.add( new UltimaAlteracaoEntidade(ultimaAlteracao));
	}
}
