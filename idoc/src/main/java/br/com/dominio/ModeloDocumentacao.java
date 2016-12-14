package br.com.dominio;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gabriel Barbosa
 * @version 1.0
 * @see 2016-12-12
 * 
 * Classe para agrupar varios documentos e assim formar um modelo de
 * documentacao a ser seguido por algum projeto.
 * Sendo que este modelo devera ser o que o usuario idealizou para o 
 * projeto com base em algum modelo de processo.
 */

public class ModeloDocumentacao {
	
	protected Long codigoUnico;

	private List<UltimaAlteracao> historicoAlteracao;
	private List<Documento> 	  documentacaoModelo;

	public ModeloDocumentacao( Long codigoUnico, List<Documento> documentacaoModelo, List<UltimaAlteracao> historicoAlteracao,
			UltimaAlteracao ultimaAlteracao) {
		this.codigoUnico 		= codigoUnico == null ? 0L : codigoUnico;
		this.documentacaoModelo = documentacaoModelo == null ? new ArrayList<Documento>() : documentacaoModelo; 
		this.historicoAlteracao = historicoAlteracao == null ? new ArrayList<UltimaAlteracao>() : historicoAlteracao;
		if( ultimaAlteracao == null )
			this.historicoAlteracao.add(ultimaAlteracao);	
	}

	public Long getCodigoUnico() {
		return codigoUnico;
	}

	public void setCodigoUnico(Long codigoUnico) {
		this.codigoUnico = codigoUnico;
	}

	public List<UltimaAlteracao> getHistoricoAlteracao() {
		return historicoAlteracao;
	}

	public void setHistoricoAlteracao(List<UltimaAlteracao> historicoAlteracao) {
		this.historicoAlteracao = historicoAlteracao;
	}

	public List<Documento> getDocumentacaoModelo() {
		return documentacaoModelo;
	}

	public void setDocumentacaoModelo(List<Documento> documentacaoModelo) {
		this.documentacaoModelo = documentacaoModelo;
	}
}

