package br.com.dominio;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  Gabriel Barbosa
 * @version 1.0
 * @see     2016-12-10
 * 
 * Parte que representa cada campo que o usuario pode usar 
 * para compor uma parte de um documento
 * */
public class Corpo extends ParteDocumento{
	
	private List<Campo> camposCorpo;

	public Corpo(Long codigoUnico, List<UltimaAlteracao> historicoAlteracao, UltimaAlteracao ultimaAlteracao, List<Campo> camposCorpo) {
		super(  codigoUnico, historicoAlteracao, ultimaAlteracao);
		if( camposCorpo == null )
			camposCorpo = new ArrayList<Campo>();
		this.camposCorpo = camposCorpo;
	}
	
	public List<Campo> camposCorpo(){
		return this.camposCorpo;
	}
	
	public void setCodigoUnico( Long codigoUnico ){
		this.codigoUnico = codigoUnico;
	}
	
	public Long getCodigoUnico(){
		return this.codigoUnico;
	}
	
	@Override
	public String getMarkdown() {
		StringBuilder textoMarkdown = new StringBuilder();
		this.camposCorpo.forEach( a -> textoMarkdown.append(a.getConteudo()));
		return textoMarkdown.toString();
	}
	
}
