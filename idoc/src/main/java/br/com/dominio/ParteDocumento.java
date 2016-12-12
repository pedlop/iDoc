package br.com.dominio;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  Gabriel Barbosa
 * @version 1.0
 * @see     2016-12-10
 * 
 * Parte de todo documento. 
 * Todas as caracteriscas que as partes documento 
 * de cumpri 
 * */

public abstract class ParteDocumento implements IExportMarkdown{
	
	protected List<UltimaAlteracao> historicoAlteracao;
	
	
	/** GUARDA OS HISTORICOS DE ALTERACOES
	 *  FEITAS NOS DOCUMENTOS EDITADOS PELO USUARIO.*/
	public ParteDocumento( List<UltimaAlteracao> historicoAlteracao, UltimaAlteracao ultimaAlteracao ){
		if( historicoAlteracao == null )
			historicoAlteracao = new ArrayList<UltimaAlteracao>();
		this.historicoAlteracao = historicoAlteracao;
		this.historicoAlteracao.add(ultimaAlteracao);
	}	
}
