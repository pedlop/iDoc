package br.com.dominio;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  Gabriel Barbosa
 * @version 1.0
 * @see     2016-12-8
 * 
 * Classe para mapear os projetos criados no iDoc, 
 * onde cada objeto representa um novo projeto na 
 * organizacao. 
 * Cada projeto deve seguir um modelo de documentacao.
 * */

public class Projeto {
	
	private Long codigoUnico;
	
	private List<UltimaAlteracao> historicoAlteracao;
	
	private ModeloDocumentacao modelo;
	
	/**
	 * Construtor a ser usado quando
	 * se esta alterando modelo de documentacao 
	 * de um projeto.
	 * */
	public Projeto( Long codigoUnico, ModeloDocumentacao modelo, List<UltimaAlteracao> historicoAlteracao, UltimaAlteracao ultimaAlteracao){
		this.codigoUnico = codigoUnico;
		this.modelo		 = modelo; 
		this.historicoAlteracao = historicoAlteracao;
		this.historicoAlteracao.add(ultimaAlteracao);
	}
	
	/**
	 * Construtor a ser usado quando
	 * se esta consultado projeto da 
	 * base dados.
	 * */
	public Projeto( Long codigoUnico, ModeloDocumentacao modelo, List<UltimaAlteracao> historicoAlteracao){
		this.codigoUnico = codigoUnico;
		this.modelo		 = modelo;
		this.historicoAlteracao = historicoAlteracao;
	}
	
	/**
	 * Construtor a ser usado quando se esta criando 
	 * um projeto pela primeira vez.
	 * */
	public Projeto( ModeloDocumentacao modelo, UltimaAlteracao ultimaAlteracao ){
		this.codigoUnico = 0L;
		this.historicoAlteracao = new ArrayList<UltimaAlteracao>();
		this.historicoAlteracao.add(ultimaAlteracao);
	}
	
	public Long getCodigoUnico(){
		return this.codigoUnico;
	}
	
	public ModeloDocumentacao getModeloDocumentacao(){
		return this.modelo;
	}

}
