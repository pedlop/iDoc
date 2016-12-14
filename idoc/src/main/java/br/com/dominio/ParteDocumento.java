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
 * deve atender.
 * */

public abstract class ParteDocumento implements IExportMarkdown{
	
	protected Long codigoUnico;
	
	protected List<UltimaAlteracao> historicoAlteracao;
	
	/** GUARDA OS HISTORICOS DE ALTERACOES
	 *  FEITAS NOS DOCUMENTOS EDITADOS PELO USUARIO.*/
	public ParteDocumento( Long codigoUnico, List<UltimaAlteracao> historicoAlteracao, UltimaAlteracao ultimaAlteracao ){
		if( codigoUnico != null )
			this.codigoUnico = codigoUnico;
		else
			this.codigoUnico = 0l;
		if( historicoAlteracao == null )
			historicoAlteracao = new ArrayList<UltimaAlteracao>();
		this.historicoAlteracao = historicoAlteracao;
		
		if( ultimaAlteracao != null )
			this.historicoAlteracao.add(ultimaAlteracao);
	}
	
}
