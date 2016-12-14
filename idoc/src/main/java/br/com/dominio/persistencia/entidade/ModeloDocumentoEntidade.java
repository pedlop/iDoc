package br.com.dominio.persistencia.entidade;

import java.io.Serializable;
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

import br.com.dominio.Documento;

@Entity
@Table
public class ModeloDocumentoEntidade implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name = "id_modelo_documento", sequenceName = "id_modelo_documento_sequencia", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_modelo_documento")
	private Long codigoUnico;
	
	@OneToOne
	private DocumentoEntidade modelo;
	
	@ManyToOne
	private ModeloEntidade modeloEntidade;
	
	@OneToMany
	public List<UltimaAlteracaoEntidade> ultimaAlteracao;
	
	public void setModelo( Documento documento ){
		this.modelo = new DocumentoEntidade();
		this.modelo.setDocumento( documento.getCabecalho(),documento.getIntroducao(), documento.getAlteracaoes(), null);
	}
	
	public Documento getModelo(){
		return this.modelo.getDocumento();
	}
}
