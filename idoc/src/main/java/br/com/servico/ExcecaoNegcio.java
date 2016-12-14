package br.com.servico;

public class ExcecaoNegcio extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExcecaoNegcio( String messagem ){
		super(messagem);
	}
}
