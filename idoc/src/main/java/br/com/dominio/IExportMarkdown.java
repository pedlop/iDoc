package br.com.dominio;

/**
 * @author  Gabriel Barbosa
 * @version 1.0
 * @see     2016-12-10
 * 
 * Interface que classifica objetos que 
 * podem compor um documento, sendo que toda 
 * a parte de um documento deve cumprir com 
 * este metodo que define um padrao de 
 * escrita em markdown do documento.
 * 
 * */

public interface IExportMarkdown {
	public String getMarkdown();
}
