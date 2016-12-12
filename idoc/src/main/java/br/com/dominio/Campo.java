package br.com.dominio;

/**
 * @author  Gabriel Barbosa
 * @version 1.0
 * @see     2016-12-8
 * 
 * Classe para mapear cada campo que existe em um 
 * formulario, sendo que cada campo tem seu tamanho 
 * especifico e su forma. 
 * 
 * Cada documento no iDoc e formado por um conjunto de campos.
 * */

public class Campo {
	
	private String nomeCampo;
	private String textoAjudaCampo;
	public final   TipoCampo tipoCampo;
	private String conteudo;
	
	public Campo( String nomeCampo, String textoAjudaCampo, TipoCampo tipoCampo){
		this.nomeCampo 		 = nomeCampo;
		this.textoAjudaCampo = textoAjudaCampo;
		this.tipoCampo 		 = tipoCampo;
	}

	public String getNomeCampo() {
		return nomeCampo;
	}

	public void setNomeCampo(String nomeCampo) {
		this.nomeCampo = nomeCampo;
	}

	public String getTextoAjudaCampo() {
		return textoAjudaCampo;
	}

	public void setTextoAjudaCampo(String textoAjudaCampo) {
		this.textoAjudaCampo = textoAjudaCampo;
	}
	
	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
}