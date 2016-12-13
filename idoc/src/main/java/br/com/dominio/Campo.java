package br.com.dominio;

/**
 * @author Gabriel Barbosa
 * @version 1.0
 * @see 2016-12-8
 * 
 *      Classe para mapear cada campo que existe em um formulario, sendo que
 *      cada campo tem seu tamanho especifico e su forma.
 * 
 *      Cada documento no iDoc e formado por um conjunto de campos.
 */

public class Campo {

	private Long codigoUnico;
	private String nomeCampo;
	private String textoAjudaCampo;
	private TipoCampo tipoCampo;
	private String conteudo;

	public Campo(Long codigoUnico, String nomeCampo, String textoAjudaCampo, TipoCampo tipoCampo, String conteudo) {
		this.codigoUnico = codigoUnico;
		this.nomeCampo = nomeCampo;
		this.textoAjudaCampo = textoAjudaCampo;
		this.tipoCampo = tipoCampo;
		this.conteudo = conteudo;
	}

	public Campo(String nomeCampo, String textoAjudaCampo, TipoCampo tipoCampo) {
		this.nomeCampo = nomeCampo;
		this.textoAjudaCampo = textoAjudaCampo;
		this.tipoCampo = tipoCampo;
	}

	public Long getCodigoUnico() {
		return codigoUnico;
	}

	public void setCodigoUnico(Long codigoUnico) {
		this.codigoUnico = codigoUnico;
	}

	public void setTipoCampo(TipoCampo tipoCampo) {
		this.tipoCampo = tipoCampo;
	}

	public TipoCampo getTipoCampo() {
		return tipoCampo;
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