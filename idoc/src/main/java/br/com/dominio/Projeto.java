package br.com.dominio;

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
	
	private ModeloDocumentacao modelo;
	
	public Projeto( Long codigoUnico, ModeloDocumentacao modelo ){
		this.codigoUnico = codigoUnico;
		this.modelo		 = modelo; 
	}
	
	public Long getCodigoUnico(){
		return this.codigoUnico;
	}
	
	public ModeloDocumentacao getModeloDocumentacao(){
		return this.modelo;
	}

}
