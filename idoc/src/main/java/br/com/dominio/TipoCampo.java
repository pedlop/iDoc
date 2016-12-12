package br.com.dominio;

/**
 * @author  Gabriel Barbosa
 * @version 1.0
 * @see     2016-12-10
 * 
 * Informação sobre o tipo do campo que sera 
 * usada mais a frente para construir a interface 
 * com o usúario sendo que para cada tipo de 
 * campo se tem uma forma especifica de 
 * apresentar a informação.
 * */

public enum TipoCampo {
	
	caixaTextoSimples(1),
	caixaTextoMedia(2),
	caixaTextoGrande(3);
	
	public int tipoCampo;
	
	private TipoCampo( int tipoCampo) {
		this.tipoCampo = tipoCampo;
	}
}
