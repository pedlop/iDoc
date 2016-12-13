package br.com.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author  Gabriel Barbosa
 * @version 1.0
 * @see     2016-12-10
 * 
 * Parte fundamental do sistema representa todos os 
 * documentos que fazem parte de um 
 * modelo de documentacao a ser adotado em um projeto.
 * */

public class Documento extends ParteDocumento{
	
	public Long codigoUnico;
	
	private List<ParteDocumento> partesDocumento;
	
	/** Cria um novo documento com o cabecalho e 
	 *  introducao correspondentes mas caso o 
	 *  documento ja foi criado basta passar a 
	 *  lista das partes do documento.*/
	
	public Documento( Long codigoUnico,  Cabecalho cabecalho, Introducao introducao, List<UltimaAlteracao> historicoAlteracao, UltimaAlteracao ultimaAlteracao){
		super( codigoUnico, historicoAlteracao, ultimaAlteracao);
		this.partesDocumento = new ArrayList<ParteDocumento>();
		this.partesDocumento.add(cabecalho);
		this.partesDocumento.add(introducao);
	}
	
	public Documento( Long codigoUnico, List<UltimaAlteracao> historicoAlteracao, List<ParteDocumento> partesDocumento ){
		super( codigoUnico, historicoAlteracao, null);
		this.partesDocumento = partesDocumento;
	}
	
	public void  adicionaParteDocumento( ParteDocumento parteDocumento){
		this.partesDocumento.add(parteDocumento);
	}
	
	public void removeParteDocumento( ParteDocumento parteDocumento ){
		this.partesDocumento.remove(partesDocumento);
	}
	
	/**
	 * Retorna a lista que so pode ser 
	 * lida do documento.
	 * */
	public List<ParteDocumento> documento(){
		return Collections.unmodifiableList(this.partesDocumento);
	}

	@Override
	public String getMarkdown() {
		StringBuilder textMarkdow = new StringBuilder();
		this.partesDocumento.forEach( a -> textMarkdow.append(a.getMarkdown()));
		return textMarkdow.toString();
	}
	
}
