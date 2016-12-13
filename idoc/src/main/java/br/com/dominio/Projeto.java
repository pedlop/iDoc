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
	
	private String nomeProjeto;
	
	private List<UltimaAlteracao> historicoAlteracao;
	
	private ModeloDocumentacao modelo;
	
	/**
	 * Construtor a ser usado quando
	 * se esta alterando modelo de documentacao 
	 * de um projeto.
	 * */
	public Projeto( Long codigoUnico, String nomeProjeto,  ModeloDocumentacao modelo, List<UltimaAlteracao> historicoAlteracao, UltimaAlteracao ultimaAlteracao){
		this.codigoUnico = codigoUnico;
		this.nomeProjeto = nomeProjeto;
		this.modelo		 = modelo; 
		this.historicoAlteracao = historicoAlteracao;
		this.historicoAlteracao.add(ultimaAlteracao);
	}
	
	/**
	 * Construtor a ser usado quando
	 * se esta consultado projeto da 
	 * base dados.
	 * */
	public Projeto( Long codigoUnico, String nomeProjeto,  ModeloDocumentacao modelo, List<UltimaAlteracao> historicoAlteracao){
		this.codigoUnico = codigoUnico;
		this.nomeProjeto = nomeProjeto;
		this.modelo		 = modelo;
		this.historicoAlteracao = historicoAlteracao;
	}
	
	/**
	 * Construtor a ser usado quando se esta criando 
	 * um projeto pela primeira vez.
	 * */
	public Projeto(Long codigoUnico,  String nomeProjeto,  ModeloDocumentacao modelo, UltimaAlteracao ultimaAlteracao ){
		this.codigoUnico = codigoUnico;
		this.nomeProjeto = nomeProjeto;
		this.historicoAlteracao = new ArrayList<UltimaAlteracao>();
		this.historicoAlteracao.add(ultimaAlteracao);
	}

	public Long getCodigoUnico() {
		return codigoUnico;
	}

	public void setCodigoUnico(Long codigoUnico) {
		this.codigoUnico = codigoUnico;
	}

	public String getNomeProjeto() {
		return nomeProjeto;
	}

	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	public List<UltimaAlteracao> getHistoricoAlteracao() {
		return historicoAlteracao;
	}

	public void setHistoricoAlteracao(List<UltimaAlteracao> historicoAlteracao) {
		this.historicoAlteracao = historicoAlteracao;
	}

	public ModeloDocumentacao getModelo() {
		return modelo;
	}

	public void setModelo(ModeloDocumentacao modelo) {
		this.modelo = modelo;
	}
}
